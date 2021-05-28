package com.lxkj.sunnyweather.common

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {


    companion object {

        const val Token = "3jns4KwfPCoeCPYC";//这个是用于请求的Key


        @SuppressLint("StaticFieldLeak")
        lateinit var mContext: Context

    }


    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext


    }


}