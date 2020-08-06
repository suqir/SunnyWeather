package com.suqir.sunnyweather.android.logic.network

import com.suqir.sunnyweather.android.SunnyWeatherApplication
import com.suqir.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Author: Suqir
 * Date: 2020/8/6 10:12
 * Desc: 用于访问彩云天气城市搜索API的Retrofit接口
 **/
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}