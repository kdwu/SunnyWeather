package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @项目名 SunnyWeather
 * @文件名 SunnyWeatherApplication.java
 * @作者 geely
 * @创建时间 2021年06月25日 17:57:00
 * @描述 SunnyWeatherApplication
 */
class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "xfAxtbh1NKmNHoKB"
    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
    }
}