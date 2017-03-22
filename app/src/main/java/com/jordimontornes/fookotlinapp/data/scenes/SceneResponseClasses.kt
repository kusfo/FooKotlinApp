package com.jordimontornes.fookotlinapp.data.scenes

/**
 * Created by jordimontornes on 21/02/2017.
 */
data class SceneResult(val production_id:Int, val list: List<Scene>)
data class Scene(val id:Long, val number:Int, val name: String, val description:String)

