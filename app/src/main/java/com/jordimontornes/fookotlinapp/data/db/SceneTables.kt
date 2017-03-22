package com.jordimontornes.fookotlinapp.data.db

/**
 * Created by jordimontornes on 27/02/2017.
 */

object SceneTable {
    val TABLENAME = "Scene"
    val ID = "_id"
    val NUMBER = "number"
    val NAME = "name"
    val DESCRIPTION = "description"
    val ICONURL = "iconurl"
}


class ShotDefinition {
    val id:String = "1234"
    val name:String = "AERIAL SHOT"
    var takes:Int = 0
    var nexShotId:String? = ""
}

fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}
