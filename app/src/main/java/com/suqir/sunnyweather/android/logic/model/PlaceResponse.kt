package com.suqir.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

/**
 * Author: Suqir
 * Date: 2020/8/6 10:12
 * Desc: 数据模型
 **/
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)