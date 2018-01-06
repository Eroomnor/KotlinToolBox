package com.moore.ron.kotlintoolbox
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_when.*

class WhenActivity : AppCompatActivity() {
    val x = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when)

        buttonwhen1.setOnClickListener { mywhen(editTextwhen1.text.toString().toInt()) }

        // When is a series of if expression
        when (x) {
            1 -> textViewwhen1.text = ("x is 1")
            2 -> textViewwhen1.text = ("x is 2")
            else -> textViewwhen1.text = ("x is not 1 or 2")
        }

        var vehicle = "Bike"

        textViewwhen2.text =
                when(vehicle){
                    "Car","Truck"-> {
                        // some code
                        "Four wheels"
                    }
                    "Bike","Motorcycle"->{
                        // some code
                        "Two wheels"
                    }
                    else ->{
                        // some code
                        "Tractor"
                    }
                }

        // testing type and casting
        val person = "Ron"
        textViewwhen3.text = when(person) {
            is String -> person.toUpperCase()
            is Any -> person
            else -> person
        }

        // range checking
        val riskAssesment = 39
        textViewwhen4.text = when(riskAssesment){
            in 1..20->"negligable"
            in 21..40 -> "minor"
            in 41..60 -> "major"
            else -> "uknown"
        }

        // Boolean expressions
        val large:Boolean = false
        when (large){
            true -> textViewwhen5.text = "Big"
            false-> textViewwhen5.text = "Small"
        }



    }
    //-------------------------- Compares passed parameter to Int 10-----------------
    private fun mywhen(a: Int) {
        when(a) {
            10 ->  textViewwhen8.text = "The Number $a is a winner!!"
            else ->  textViewwhen8.text = "$a is not it"
        }

    }

}
