package com.jordimontornes.fookotlinapp.view.mainscreen

/**
 * Created by jordimontornes on 20/03/2017.
 */

class BoilerPlateClass(val boilerId: Int, val boilerDescription: String, val boilerValue: Int) {

    fun computeRealValue(inflation: Float): Float {
        return boilerValue * inflation
    }
}
