package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destructuring.*

class DestructuringActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destructuring)

        val person = Person("Ron","Moore",6.0)
        var(firstName,lastName,height) = person
        txtout.text = firstName
        txtout1.text = lastName
        txtout2.text = height.toString()



    }
}

 data class Person(val firstname: String, val lastname: String, val height: Double) {

}
