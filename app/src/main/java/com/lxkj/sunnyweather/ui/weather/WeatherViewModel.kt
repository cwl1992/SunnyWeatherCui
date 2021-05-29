package com.lxkj.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.lxkj.sunnyweather.login.Repository
import com.lxkj.sunnyweather.login.model.Location

class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    val locationLng = ""
    val locationLat = ""
    val placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { la ->
        Repository.refreshWeather(la.lng, la.lat)
    }


    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)

    }


}