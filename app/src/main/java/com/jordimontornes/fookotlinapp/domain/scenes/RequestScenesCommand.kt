package com.jordimontornes.fookotlinapp.domain.scenes

import com.jordimontornes.fookotlinapp.data.scenes.SceneRequest

/**
 * Created by jordimontornes on 22/02/2017.
 */
class RequestScenesCommand(private val productionId: String) :
        Command<SceneList> {
    override fun execute(): SceneList {
        val sceneRequest = SceneRequest(productionId)
        return SceneDataMapper().convertFromDataModel(sceneRequest.execute())
    }
}