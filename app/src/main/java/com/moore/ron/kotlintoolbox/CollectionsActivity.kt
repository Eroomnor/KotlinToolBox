package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_collections.*

class CollectionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)

        btn.setOnClickListener {
            val numbers = listOf<Int>(1,2,3,4,5)
            txtVw.text = numbers.toString()
            txtVw1.text = ""
        }

        btn1.setOnClickListener {
            val numbers = mutableListOf<Int>(1,2,3,4,5)
            txtVw.text = numbers.toString()
            numbers.add(7)
            txtVw1.text = "${numbers.toString()} > numbers.add(7)"

        }

        btn2.setOnClickListener {
            val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
            txtVw.text = numbers.toString()
            txtVw1.text = "First Item  ${numbers.first()} Last Item ${numbers.last()} " +
                    "Filter ${numbers.filter { it % 2 != 0 }.toString()} "
        }

        btn3.setOnClickListener {
            val myarray = listOf<String>("a","b","c","c","d","d","e","d","f")
            val noDuplicate = hashSetOf<String>("a","b","c","c","d","d","e","d","f")
            txtVw.text= "${myarray.toString()} > listof"
          txtVw1.text="${noDuplicate.toString()} > hashSetOf"



        }
        btn4.setOnClickListener{
            val noDuplicate = hashSetOf<String>("f", "a", "c", "c","j", "e", "d", "d", "d", "b","x","t","z")
            val myarray = listOf<String>("f", "a", "c", "c","j", "e", "d", "d", "d", "b","x","t","z")
            txtVw.text = myarray.toString()
            txtVw1.text = noDuplicate.sorted().toString()
        }

        btn5.setOnClickListener {
            //----------------------Note that pairs are automaticaly sorted--------------------------
            val myHashMap = hashMapOf<String,Int>("Forth" to 1,"Second"  to 3, "Third" to 2, "First" to 4)
            txtVw.text = "${myHashMap.toString()}"
            txtVw1.text = " Third = ${myHashMap["Third"].toString()} "
        }






    }
}
