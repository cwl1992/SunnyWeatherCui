package com.lxkj.sunnyweather.login

import androidx.lifecycle.liveData
import com.lxkj.sunnyweather.login.dao.PlaceDao
import com.lxkj.sunnyweather.login.model.Place
import com.lxkj.sunnyweather.login.model.SunnyWeatherNetWork
import com.lxkj.sunnyweather.login.model.Weather
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlin.coroutines.CoroutineContext


//Repository 仓库
object Repository {

    //搜索城市
    fun searchPlaces(query: String) = fire(Dispatchers.IO) {
        val placeResponse = SunnyWeatherNetWork.searchPlaces(query)
        if (placeResponse.status == "ok") {
            val place = placeResponse.places
            Result.success(place)
        } else {
            Result.failure(RuntimeException("response status is \${placeResponse.status"))
        }

    }


    //查询天气
    fun refreshWeather(lng: String, lat: String) = fire(Dispatchers.IO) {
        coroutineScope {
            val deferredRealtime = async {
                SunnyWeatherNetWork.getRealtimeWeather(lng, lat)
            }
            val deferredDaily = async {
                SunnyWeatherNetWork.getDailyWeather(lng, lat)
            }
            val realtimeResponse = deferredRealtime.await()
            val dailyResponse = deferredDaily.await()
            if (realtimeResponse.status == "ok" && dailyResponse.status == "ok") {
                val weather = Weather(realtimeResponse.result.realtime, dailyResponse.result.daily)
                Result.success(weather)
            } else {
                Result.failure(
                    RuntimeException(
                        "realtime response status is ${realtimeResponse.status}" +
                                "daily response status is ${dailyResponse.status}"
                    )
                )
            }
        }

    }


    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>>(context) {
            val result = try {
                block()
            } catch (e: Exception) {
                Result.failure<T>(e)
            }
            emit(result)
        }


    //-------保存和获取地点信息---------------
    fun savePlace(place: Place) = PlaceDao.savePlace(place)

    fun getSavePlace() = PlaceDao.getPlace()

    fun isSavePlace() = PlaceDao.isPlaceKey()


    //-------保存和获取地点信息---------------


}