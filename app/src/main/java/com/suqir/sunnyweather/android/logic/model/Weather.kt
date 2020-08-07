package com.suqir.sunnyweather.android.logic.model

/**
 * Author: Suqir
 * Date: 2020/8/6 12:15
 * Desc: 天气数据，封装Realtime和Daily
 **/
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)