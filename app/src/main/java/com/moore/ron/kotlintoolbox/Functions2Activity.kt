package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_functions2.*

class Functions2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions2)


        // text or Int because the Parameter is Any
        btn1.setOnClickListener { presententGently(edT1.text) }

        // text or Int because the Parameter is Any
        btn2.setOnClickListener { presententGently(edT1.text) }

        // return has + you can only add Int
        btn3.setOnClickListener{ textViewout.text = mySum(2, 5).toString() }

        // return has + you can only add Int
        btn4.setOnClickListener{ textViewout.text = myBigSum(2,5,7,3,8).toString() }

        // return has + you can only add Int
        btn5.setOnClickListener{ textViewout.text = myBigStr("Ron",8,"Sandy",5,"Cindy").toString() }

        // an Expresion
        btn6.setOnClickListener{ textViewout.text = mySquare(8).toString() }

        // named arguments allows any parameter to be passed and any parameter to be omitted
        btn7.setOnClickListener {printValue(value = edT1.text.toString(),suffix = edT1.text.toString())}


    }


    // a Procedure has no return statement
    private fun presententGently(c: Any?) { textViewout.text = c.toString() }

    // returns an Int because the + sign
    private fun mySum(a: Int, b: Int): Int { return  a + b }

    // accepts as many arguments as you want vararg
    private fun myBigSum(vararg bigNumbers:Int): Any {return bigNumbers.sum()}

    // any but if you do math in the fun then you must return a number type
    private fun myBigStr(vararg texts: Any):Any{ return texts.joinToString(",") }

    // no return is needed this is an expression that can be called
    private fun mySquare(x: Int) = x*x

    // named arguments allows individual arguments to be passed notice default values given
    private fun printValue(value: String = "", inBracket: Boolean = true, prefix: String ="" , suffix: String ="") {

        if (inBracket){
            textViewout.text = value
        }else{
            textViewout.text = "value"
        }
        textViewout1.text = suffix


    }
}
