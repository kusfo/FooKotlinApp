package com.jordimontornes.fookotlinapp.data.db

import java.util.*

/**
 * Created by jordimontornes on 27/02/2017.
 */
class SceneDB(val map:MutableMap<String, Any?>) {

    var _id: Long by map
    var number: Int by map
    var name: String by map
    var description: String by map
    var iconUrl: String by map

    constructor(id:Long, number: Int, name: String, description: String, iconUrl: String) : this(HashMap()) {
        this._id = id
        this.number = number
        this.name = name
        this.description = description
        this. iconUrl = iconUrl
    }
}