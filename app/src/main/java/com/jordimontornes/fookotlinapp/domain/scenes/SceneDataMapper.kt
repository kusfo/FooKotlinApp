package com.jordimontornes.fookotlinapp.domain.scenes

import com.jordimontornes.fookotlinapp.data.scenes.Scene
import com.jordimontornes.fookotlinapp.data.scenes.SceneResult

/**
 * Created by jordimontornes on 21/02/2017.
 */
class SceneDataMapper {

    fun convertFromDataModel(sceneResult: SceneResult) : SceneList {
        return SceneList(sceneResult.production_id, convertSceneListToDomainSceneList(sceneResult.list))
    }

    fun convertSceneListToDomainSceneList(list: List<Scene>) : List<SceneObject> {
        return list.mapIndexed { i, scene -> convertSceneItemToDomainScene(scene) }
    }

    fun convertSceneItemToDomainScene(scene : Scene) :SceneObject{
        return SceneObject(scene.id, scene.number , scene.name ,scene.description, generateIconUrl())
    }

    private fun generateIconUrl() : String = "https://cdn3.iconfinder.com/data/icons/audiovisual-production-outlined-pixel-perfect/64/vp-05-128.png"
}