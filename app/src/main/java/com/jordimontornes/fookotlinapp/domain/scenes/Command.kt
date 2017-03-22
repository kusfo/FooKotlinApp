package com.jordimontornes.fookotlinapp.domain.scenes

/**
 * Created by jordimontornes on 21/02/2017.
 */

public interface Command<T> {
    fun execute(): T
}