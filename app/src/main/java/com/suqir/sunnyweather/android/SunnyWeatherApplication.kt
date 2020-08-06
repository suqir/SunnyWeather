package com.suqir.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * Author: Suqir
 * Date: 2020/8/6 10:10
 * Desc: 配置全局属性
 **/
class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "彩云天气的令牌值"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}