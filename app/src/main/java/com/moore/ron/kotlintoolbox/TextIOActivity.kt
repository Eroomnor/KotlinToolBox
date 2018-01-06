package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conditional_logic.*
import kotlinx.android.synthetic.main.activity_text_io.*
import kotlinx.android.synthetic.main.activity_when.*

class TextIOActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_io)

        buttonIO.setOnClickListener {

            val str = editTextIO.text.toString()
            val num1 = editTextIO1.text.toString().toFloatOrNull()
            val num2 = editTextIO2.text.toString().toFloatOrNull()
            val list = editTextIO3.text.toList()


            // testing type and casting
            textViewIO.text = when(str) {
                is String -> str.toUpperCase()
                is Any -> str
                else -> str
            }





            }










        }





    }

