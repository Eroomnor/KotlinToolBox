package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_for.*

class ForActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for)

        for (i in 1..7) Log.d("DEBUG",""+i)
        for (i in 5 downTo 1) Log.d("DEBUG",""+i)
        for (i in 1..7 step 2) Log.d("DEBUG",""+i)
        for (i in 'a'..'j') Log.d("DEBUG",""+i)


        btn1.setOnClickListener {
            val items = listOf<Int>(11, 22, 33, 44, 55, 66, 77, 88, 99, 101)
            for (index in items)
                Log.d("DEBUG", "" + index)
        }

        btn2.setOnClickListener {
            val items = listOf<Int>(11, 22, 33, 44, 55, 66, 77, 88, 99, 101)
            for (index in items.indices)
                Log.d("DEBUG", "index:  $index = ${items[index]}")
        }

        btn3.setOnClickListener {
            val items = listOf<Int>(11, 22, 33, 44, 55, 66, 77, 88, 99, 101)
            for ((index, value) in items.withIndex())
                Log.d("DEBUG", "index:  $index = $value")
        }

        btn4.setOnClickListener {
            var a = 0
            while (a < 10) {
                Log.d("DEBUG", "While $a ")
                a++
            }
        }
        btn5.setOnClickListener {
            var a = 0
            do {
                Log.d("DEBUG", "Do While " + a)
                a++
            } while (a < 10)
        }

        btn6.setOnClickListener {
            var a = 0
            while (a < 10) {
                a++
                if (a % 2 != 0)
                    Log.d("DEBUG", "a = $a")
                else
                    continue
            }
        }
        btn7.setOnClickListener {
            var a = 0
            while (a < 10) {
                a++
                if (a % 2 != 0)
                    Log.d("DEBUG", "a = $a")
                else
                    break
            }
        }
        btn8.setOnClickListener {
            for (a in 1..10)
                Log.d("DEBUG", "" + a)
        }

        btn9.setOnClickListener {
            for (a in 10 downTo 1)
                Log.d("DEBUG", "" + a)
        }
        btn10.setOnClickListener {
            for (a in 10 downTo 1 step 2)
                Log.d("DEBUG", "" + a)
        }
        btn11.setOnClickListener {
            for (a in 1 until 10)
                Log.d("DEBUG", "" + a)
        }
        val intRange = 1..6
        val charRange = 'A'..'B'
        btn12.setOnClickListener {
            for (value in intRange) {
                if (value == 3)
                    continue // this skips 3
                // or break to stop the loop at 2
                Log.d("DEBUG", "Outer Loop" + value)
                for (char in charRange) {
                    Log.d("DEBUG", "\tInner Loop" + char)
                }


            }
        }
        btn13.setOnClickListener {

            outer@ for (value in intRange) {
                Log.d("DEBUG", "Outer Loop" + value)
                inner@ for (char in charRange) {
                    if (char == 'B')
                        break@outer
                    Log.d("DEBUG", "\tInner Loop" + char)
                }
            }
        }
        btn14.setOnClickListener {
            Log.d("DEBUG", "Before function Call")
            doSth()
            Log.d("DEBUG", "After function Call")

        }
    }

    fun doSth() {
        val intRange = 1..6
        val charRange = 'A'..'B'
        for (value in intRange) {
            Log.d("DEBUG", "Outer Loop" + value)
            for (char in charRange) {
                Log.d("DEBUG", "\tInner Loop" + char)
                return // returns before the loop can iterate again
            }
        }

    }
}
