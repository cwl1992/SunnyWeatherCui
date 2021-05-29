package com.lxkj.sunnyweather.login

import androidx.lifecycle.liveData
import com.lxkj.sunnyweather.login.model.SunnyWeatherNetWork
import kotlinx.coroutines.Dispatchers
import retrofit2.http.Query
import java.lang.RuntimeException
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


    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>>(context) {
            val result = try {
                block()
            } catch (e: Exception) {
                Result.failure<T>(e)
            }
            emit(result)
        }

}