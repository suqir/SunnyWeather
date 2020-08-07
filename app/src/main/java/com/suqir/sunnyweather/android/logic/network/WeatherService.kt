package com.suqir.sunnyweather.android.logic.network


import com.suqir.sunnyweather.android.SunnyWeatherApplication
import com.suqir.sunnyweather.android.logic.model.DailyResponse
import com.suqir.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Author: Suqir
 * Date: 2020/8/7 11:05
 * Desc: 彩云天气API接口
 **/
interface WeatherService {
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<DailyResponse>
}