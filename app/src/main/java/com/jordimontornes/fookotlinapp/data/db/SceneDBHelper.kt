package com.jordimontornes.fookotlinapp.data.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.jordimontornes.fookotlinapp.view.global.KotlinApp
import org.jetbrains.anko.db.*

/**
 * Created by jordimontornes on 27/02/2017.
 */
class SceneDBHelper(ctx:Context = KotlinApp.instance) : ManagedSQLiteOpenHelper(ctx,
        SceneDBHelper.DB_NAME, null, SceneDBHelper.DB_VERSION) {

    companion object {
        val DB_NAME = "filming.db"
        val DB_VERSION = 1
        val instance by lazy { SceneDBHelper() }
    }

    override fun onCreate(db: SQLiteDatabase) {
       db.createTable(
               SceneTable.TABLENAME, true,
               SceneTable.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
               SceneTable.NUMBER to INTEGER,
               SceneTable.NAME to TEXT,
               SceneTable.DESCRIPTION to TEXT,
               SceneTable.ICONURL to TEXT
               )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable(SceneTable.TABLENAME, true)
        onCreate(db)
    }

    fun saveSceneDescription(db: SQLiteDatabase, sceneID:Int, details:String) {
        db.update(SceneTable.TABLENAME,Pair(SceneTable.DESCRIPTION,details))
    }
}