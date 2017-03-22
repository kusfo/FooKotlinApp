package com.jordimontornes.fookotlinapp.view.mainscreen

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jordimontornes.fookotlinapp.R
import com.jordimontornes.fookotlinapp.domain.scenes.SceneList
import com.jordimontornes.fookotlinapp.domain.scenes.SceneObject
import com.jordimontornes.fookotlinapp.view.utils.ctx
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_scene.view.*

/**
 * Created by jordimontornes on 20/02/2017.
 */

class SceneListAdapter(val productionSceneList: SceneList, val itemClick: (SceneObject) -> Unit) : RecyclerView.Adapter<SceneListAdapter.SceneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SceneViewHolder? {
        val view = LayoutInflater.from(parent.ctx).inflate(R.layout.item_scene, parent, false)
        return SceneViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: SceneViewHolder, position: Int) {
       holder.bindScene(productionSceneList[position])
    }

    override fun getItemCount(): Int = productionSceneList.size

    class SceneViewHolder(view: View, val itemClick: (SceneObject) -> Unit) : RecyclerView.ViewHolder(view) {

        fun bindScene(scene: SceneObject) {

            with(scene) {
                Picasso.with(itemView.ctx).load(iconUrl).into(itemView.icon)
                itemView.name.text = name
                itemView.description.text = description
                itemView.number.text = "$number"
                itemView.identf.text = "$id"
                itemView.setOnClickListener { itemClick(this) }
            }
        }
    }
}
