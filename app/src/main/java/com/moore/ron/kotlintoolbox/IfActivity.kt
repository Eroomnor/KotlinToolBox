package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_if.*

class IfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if)

        val x = 5
        val y =5

        // Kotlin is Expression oriented
        textViewif1.text = if (x > 10)"greater" else "smaller"

        // The last line of the if branch is returned as the result || is or
        val greeting = if (x > 10 || y > 10){
            // some code
            "Good morning"
        }else{
            /// some code
            "Good afternoon"
        }
        textViewif2.text = greeting

        // if can be used inside a String Template
        textViewif3.text = "You are ${if (x<10)" a young" else " an old"} person"

        // range works in Characters
        val mychar = 'R'
        val alphabet = 'A'..'Z'
        if (mychar in alphabet) textViewif4.text = "yes ${mychar}" else textViewif4.text ="no ${mychar}"

        //........................Takes edt1 and edt2  input and converts to Int---------------------
        buttonif1.setOnClickListener{myif(editTextif1.text.toString().toInt(),editTextif2.text.toString().toInt())}
        //------------------------- Compares passed parameters to each other----------------------------

    }
    fun myif(a:Int,b:Int) {

        val max = if (a>b) a else b

        textViewif7.text = "The Greater Number is $max"
    }
}
