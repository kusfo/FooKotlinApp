package com.jordimontornes.fookotlinapp.view.mainscreen

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.jordimontornes.fookotlinapp.domain.scenes.RequestScenesCommand
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

/**
 * Created by jordimontornes on 20/02/2017.
 */

class MainPresenter(currentView: AppCompatActivity) {
    var viewReference: AppCompatActivity = currentView

    fun create(): Boolean {

        viewReference.forecastList.layoutManager = LinearLayoutManager(viewReference)

        viewReference.doAsync {
            val result = RequestScenesCommand("1").execute()
            uiThread {
                val adapter = SceneListAdapter(result) {  viewReference.toast(it.name)}
                viewReference.forecastList.adapter = adapter
            }
        }
        return true
    }
}

