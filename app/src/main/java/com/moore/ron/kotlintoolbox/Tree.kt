package com.moore.ron.kotlintoolbox

/**
 * Created by ron on 9/29/17.
 */

// Inheritance is declared with the ":"
class Tree : Plant() {

    override var height: Int = super.height
    get() = super.height
    set(value) {field = value}

    override fun grow(height:Int){
        this.height += height
    }
}