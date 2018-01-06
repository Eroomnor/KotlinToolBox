package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arrays.*

class ArraysActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrays)
//------------ Array of 10 items which values are genereted by: index + 1000 --------------------
        val a = Array(5, { i -> i + 1000 })

        arrayTxtVw.text = a[0].toString()+"\n"+
                a[1].toString()+"\n"+
                a[2].toString()+"\n"+
                a[3].toString()+"\n"+
                a[4].toString()



    }
}
