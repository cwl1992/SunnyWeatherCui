package com.lxkj.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.lxkj.sunnyweather.login.Repository
import com.lxkj.sunnyweather.login.model.Place
import java.util.ArrayList

class PlaceViewModel : ViewModel() {


    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        //注意这个参数要和表达式中的参数一致
        Repository.searchPlaces(query)
    }

    fun searchPlaces(aa: String) {
        searchLiveData.value = aa
    }


}