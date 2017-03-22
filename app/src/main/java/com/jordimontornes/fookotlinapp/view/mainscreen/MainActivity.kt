package com.jordimontornes.fookotlinapp.view.mainscreen

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jordimontornes.fookotlinapp.R


class MainActivity : AppCompatActivity() {

    private val mainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.create()
        toast("Toast is working")
    }
}

fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

val ViewGroup.childViews: List<View>
  get() = (0 until childCount).map { getChildAt(it) }