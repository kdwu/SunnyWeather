package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @项目名 SunnyWeather
 * @文件名 PlaceResponse.java
 * @作者 geely
 * @创建时间 2021年06月28日 09:52:00
 * @描述 数据模型
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)
