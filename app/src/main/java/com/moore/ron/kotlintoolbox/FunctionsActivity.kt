package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_functions.*
import org.jetbrains.anko.toast

// Example of calling a  Function twice that creates a toast and returns a value to be diplayed in a textview


class FunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions)

        // calling functions and passing edt1 and edt2 text
        button1.setOnClickListener{sum2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt())
        textViewFunctions.text = sum2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt()).toString()
        }

        button2.setOnClickListener{dif2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt())
            textViewFunctions.text = dif2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt()).toString()
        }

        button3.setOnClickListener{mul2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt())
            textViewFunctions.text = mul2num(edtFunctions1.text.toString().toInt(), edtFunctions2.text.toString().toInt()).toString()
        }

        button4.setOnClickListener{div2num(edtFunctions1.text.toString().toFloat(), edtFunctions2.text.toString().toFloat())
            textViewFunctions.text = div2num(edtFunctions1.text.toString().toFloat(), edtFunctions2.text.toString().toFloat()).toString()
        }

    }

    // receiving two Int parameters and passing String message to the toast function
    fun sum2num(a:Int,b:Int): Int { toast("$a+$b equals ${a+b}")
    return a+b
    }

    fun dif2num(a: Int,b: Int): Int { toast("$a-$b equals ${a-b}")
        return a-b}

    fun mul2num(a: Int,b: Int): Int {toast("$a*$b equals ${a*b}")
        return a*b
    }

    fun div2num(a: Float,b: Float): Float {
        if (b!=0f && a!=0f) { toast("$a/$b equals ${a / b}")
        return a/b
        }else {toast("$a/$b equals ${0f}")
        return a/b
        }

        // Toast.makeText(this,"message", Int.MAX_VALUE).show()...replaced by.... toast("text here")

    }
}
