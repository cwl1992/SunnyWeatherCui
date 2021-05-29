package com.lxkj.sunnyweather.login.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Retrofit 的构建器
object ServiceCreator {

    private const val Base_url = "https://api.caiyunapp.com/"//TODO   这个是基类地址 注意一定要有"/"  斜杠

    private val retrofit =
        Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create())
            .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)


    inline fun <reified T> create(): T = create(T::class.java)

}