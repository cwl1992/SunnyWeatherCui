package com.lxkj.sunnyweather.login.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.lxkj.sunnyweather.common.CommonSP
import com.lxkj.sunnyweather.common.SunnyWeatherApplication
import com.lxkj.sunnyweather.login.model.Place

object PlaceDao {


    //1.先获取到SharedPreferences()对象
    //2.调用edit() 保存 地点信息
    //3.取出信息,要添加一个默认值
    //4.是否包含有保存的信息

    //1.先获取到SharedPreferences()对象
    private fun aa() = SunnyWeatherApplication.mContext.getSharedPreferences(CommonSP.sunny_weather, Context.MODE_PRIVATE)


    //2.调用edit() 保存 地点信息
    fun savePlace(place: Place) {
        aa().edit {
            putString(CommonSP.place, Gson().toJson(place))
        }
    }

    //3.取出信息,要添加一个默认值
    fun getPlace(): Place {
        val place = aa().getString(CommonSP.place, "")
        return Gson().fromJson(place, Place::class.java)
    }


    //4.是否包含有保存的信息
    fun isPlaceKey() = aa().contains(CommonSP.place)


}