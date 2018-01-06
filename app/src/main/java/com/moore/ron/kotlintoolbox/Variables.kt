package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interface.*
import kotlinx.android.synthetic.main.activity_variables.*

class Variables : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variables)

        val name = "Ron"
        var isAwsome = true
        textoutvar.text = "Is $name awsome ? $isAwsome"

        var a = 3
    }
}
