package com.suqir.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Author: Suqir
 * Date: 2020/8/6 10:12
 * Desc: 地址数据
 **/
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
