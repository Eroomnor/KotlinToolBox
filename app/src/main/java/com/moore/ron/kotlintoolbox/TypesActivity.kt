package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TypesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_types)

        // convert Types using .to
        val i: Int = 7
        val d: Double = i.toDouble()

        val c:Char = 'c'
        val j: Int = c.toInt()

        val FLAG1 = true
        val FLAG2 = false
        val bitwiseOr = FLAG1 or FLAG2
        val bitwiseAnd = FLAG1 and FLAG2


        // number types
        val iHex = 0x0f
        var long = 3L
        val double = 3.5
        val float = 3.5F
        long = double.toLong()
        var strnumber = float.toString()

    // Strings escape and Raw

        // \
        val escape_str = "Escape characters " +
                "\"  skips next character " +
                "\n next line " +
                "\t tab   " +
                "\b  back space" +
                "\r carriage return" +
                "\$ prints a dollar sign"

        val raw_str = """print anything you want
            from any line, $%*/\#
            ....."""

        val str = "Example"
        val cr = str[2] // Strings are Arrays = 'a'
        // and can be iterated
        for (cr in str){
            // textview.text = cr
        }


    }
}
