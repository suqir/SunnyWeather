package com.suqir.sunnyweather.android.logic

import androidx.lifecycle.liveData
import com.suqir.sunnyweather.android.logic.model.Place
import com.suqir.sunnyweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

/**
 * Author: Suqir
 * Date: 2020/8/6 10:18
 * Desc: 仓库层的统一封装入口
 **/
object Repository {
    fun searchPlaces(query:String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}