package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity : AppCompatActivity() {
    var text =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)


        btnPlayString.setOnClickListener {
            text = edtFunctions1.text.toString()
            Toast.makeText(this, "${text.replace("cat", "dog")}, was replaced from $text", Toast.LENGTH_SHORT).show()
            textViewtext0.text = "$text, is replaced by ,${text.replace("cat", "dog")} "
        }

        // Strings escape and Raw

        // escape
        textViewtext1.text = "Escape characters " +
                "\\  prints special character " +
                "\n next line " +
                "\t tab   " +
                "\b  back space" +
                "\r carriage return" +
                "\$ prints a dollar sign"
        // Raw string
        textViewtext2.text = """print anything you want
            from any line, $%*/\#
            ....."""
            // Raw string with trimMargin
        textViewtext3.text = """Escape characters
                "\  prints spesial character
                "\n next line
                "\t tab
                "\b  back space
                "\r carriage return
                "\${'$'} prints a dollar sign"""".trimMargin()

        val str = "Example"
        val cr = str[2] // Strings are Arrays = 'a'
        // and can be iterated
        for (cr in str){
            // textview.text = cr
        }
        // equals ?
        val isequal = str.contentEquals("Exampl")

        val contains = str.contains("Ex")
        val uppercase = str.toUpperCase()
        val lowercase = str.toLowerCase()
        val subsequence = str.subSequence(4,6)
        textViewtext4.text = subsequence

    }
}
