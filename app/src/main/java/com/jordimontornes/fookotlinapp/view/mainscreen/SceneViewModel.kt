package com.jordimontornes.fookotlinapp.view.mainscreen

import android.database.sqlite.SQLiteDatabase
import com.jordimontornes.fookotlinapp.data.db.SceneDBHelper
import kotlin.properties.Delegates

/**
 * Created by jordimontornes on 20/03/2017.
 */

class SceneViewModel(val dbHelper: SceneDBHelper, val db: SQLiteDatabase) {
    var sceneID: Int by Delegates.vetoable(0) {
        property, oldValue, newValue ->
        newValue >= 0
    }

    var sceneDetails: String by Delegates.observable("") {
        property, oldValue, newValue ->
        dbHelper.saveSceneDescription(db, sceneID, newValue)
    }
}
