package com.jordimontornes.fookotlinapp.domain.scenes

/**
 * Created by jordimontornes on 20/02/2017.
 */

data class SceneObject(val id: Long, val number: Int, val name: String, val description: String, val iconUrl: String)

data class SceneList(val productionId: Int, val productionScenes: List<SceneObject>) {
    val size: Int
        get() = productionScenes.size

    operator fun get(position: Int) = productionScenes[position]
}

class SceneDrawerComposer {
    var screenWidth: Int
    var screenHeight: Int
    var screenStatus: Int
    var screenReady: Boolean

    constructor(screenWidth: Int, screenHeight: Int) {
        this.screenWidth = screenWidth
        this.screenHeight = screenHeight
        this.screenStatus = 0
        this.screenReady = false
    }
}

fun createSceneDrawerComposer() = SceneDrawerComposer(1920,1080).apply {
    screenStatus = 1
    screenReady = true
}




