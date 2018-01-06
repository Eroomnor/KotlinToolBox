package com.moore.ron.kotlintoolbox

/**
 * Created by ron on 9/29/17.
 */

        // Class functions and properties must be declared open for override in other classes to work
        //
  open class Plant {
   open var height:Int = 10
    open fun grow(height:Int){}
}