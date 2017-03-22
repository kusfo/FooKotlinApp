package com.jordimontornes.fookotlinapp.data.scenes

import android.util.Log
import com.google.gson.Gson
import java.net.URL


/**
 * Created by jordimontornes on 21/02/2017.
 */

class SceneRequest(val productionId: String) {

    companion object {
        private val URL = "http://private-c9b80-filmingorganizer.apiary-mock.com/scenes"
    }

    fun execute() : SceneResult {
        val sceneJson = URL(URL).readText()
        Log.d("SceneRequest", sceneJson)
        return Gson().fromJson(sceneJson, SceneResult::class.java)
    }
}