package com.lxkj.sunnyweather.login.network

import com.lxkj.sunnyweather.common.SunnyWeatherApplication
import com.lxkj.sunnyweather.login.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {


    //https://api.caiyunapp.com/v2/place?query=北京&token=3jns4KwfPCoeCPYC&lang=zh_CN
    @GET("v2/place?token=${SunnyWeatherApplication.Token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>


}