package com.lxkj.sunnyweather.login.model

import android.util.Log
import com.google.gson.Gson
import com.lxkj.sunnyweather.login.network.PlaceService
import com.lxkj.sunnyweather.login.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.RuntimeException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

//TODO 1.先创建了一个动态代理 ServiceCreator.create<PlaceService>()
//2. 定义 searchPlaces() 并调用接口中的搜索城市的方法 使用协程技术 await()
//3. 当外部调用 SunnyWeatherNetWork的searchPlaces()时候 Retrofit就会立即被调用并发起网络请求
// 同时当前的协程会被阻塞,直到服务器返回 await 会将解析的数据模型对象取出并返回,同时恢复协程的执行
// searchPlaces()在得到 await()的返回值后会将数据在返回到上一层

object SunnyWeatherNetWork {

    private val placeService = ServiceCreator.create<PlaceService>()

    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()

    private suspend fun <T> Call<T>.await(): T {
        return suspendCoroutine { a ->//注意这里的a 可以是任意的名字
            enqueue(object : Callback<T> {
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    //成功
                    val body = response.body()
                    Log.d("TAG", "onResponse: " + body.toString())
                    if (body != null) {
                        a.resume(body)//返回   resume  返回数据
                    } else {
                        a.resumeWithException(RuntimeException("没有数据"))
                    }
                }

                override fun onFailure(call: Call<T>, t: Throwable) {
                    //失败
                    a.resumeWithException(t)
                }

            })
        }
    }


    //TODO--------------------------------

    private val weatherService = ServiceCreator.create(WeatherService::class.java)

    //未来天气
    suspend fun getDailyWeather(lng: String, lat: String) = weatherService.getDailyWeather(lng, lat).await()

    //实时天气
    suspend fun getRealtimeWeather(lng: String, lat: String) = weatherService.getRealtimeWeather(lng, lat).await()

    //TODO--------------------------------


    //suspend fun getDailyWeather(lng: String, lat: String) = weatherService.getDailyWeather(lng, lat).await()

//    suspend fun getDailyWeather(lng: String, lat: String) = weatherService.getDailyWeather(lng, lat).await()
//    suspend fun getRealtimeWeather(lng: String, lat: String) = weatherService.getRealtimeWeather(lng, lat).await()


}