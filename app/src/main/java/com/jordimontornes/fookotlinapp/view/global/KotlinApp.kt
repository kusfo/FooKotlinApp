package com.jordimontornes.fookotlinapp.view.global

import android.app.Application

/**
 * Created by jordimontornes on 23/02/2017.
 */
class KotlinApp : Application() {

    companion object {
        lateinit var instance: KotlinApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
