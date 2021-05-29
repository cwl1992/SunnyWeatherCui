package com.lxkj.sunnyweather.login.network

import com.lxkj.sunnyweather.common.SunnyWeatherApplication
import com.lxkj.sunnyweather.login.model.DailyResponse
import com.lxkj.sunnyweather.login.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {


//    //查询实时天气
//    //https://api.caiyunapp.com/v2.5/3jns4KwfPCoeCPYC/121.6544,25.1552/realtime.json
//    @GET("v2.5/${SunnyWeatherApplication.Token}/{lng},{lat}/realtime.json")
//    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>
//
//    //查询未来天气
//    //https://api.caiyunapp.com/v2.5/3jns4KwfPCoeCPYC/121.6544,25.1552/daily.json
//    @GET("v2.5/${SunnyWeatherApplication.Token}/{lng},{lat}/daily.json")
//    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Callback<DailyResponse>


    @GET("v2.5/${SunnyWeatherApplication.Token}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.Token}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>


}