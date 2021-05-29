package com.lxkj.sunnyweather.login.model

import com.google.gson.annotations.SerializedName

//TODO 定义地点返回结果 里面包含状态码和城市信息,城市信息里面包含城市名字,城市地址和经纬度,经纬度对象里面包含经纬度
//注意这里的 Location 不要导错包,不是定位的,而是我们自己写的对象
/*
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)*/


data class PlaceResponse(
    val places: List<Place>,
    val query: String,
    val status: String
)

data class Place(
    val formatted_address: String,
    val id: String,
    val location: Location,
    val name: String,
    val place_id: String
)

data class Location(
    val lat: String,
    val lng: String
)