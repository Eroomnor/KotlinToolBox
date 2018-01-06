package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_conditional_logic.*
import kotlinx.android.synthetic.main.activity_when.view.*

class ConditionalLogic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conditional_logic)





        btnConditional.setOnClickListener {
            val a = editTextConditional.text.toString().toInt()
            val b = editTextConditional1.text.toString().toInt()



            if(a > b && a != b){ textViewConditional.text = "$a greater than $b" }

            if(a < b && a != b){ textViewConditional.text = "$a is lessthan than $b" }

            if (a == b){ textViewConditional.text = "$a is equal to $b" }

            if (a != b){ textViewConditional.text = "$a is not equal to $b" }


        }



    }
}
