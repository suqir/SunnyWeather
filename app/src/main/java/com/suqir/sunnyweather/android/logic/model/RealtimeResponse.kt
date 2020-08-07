package com.suqir.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Author: Suqir
 * Date: 2020/8/6 12:00
 * Desc: 实时天气数据
 **/
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}