package com.moore.ron.kotlintoolbox

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class.*
import java.time.Year

class ClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)
        val car = Car("Chevy", "Colorado", 2006)
        textViewclass.text = "${car.make} ${car.model} ${car.year} "

        val truck = Truck("Chevy", "Silverado", 10000)
        // Runs the fun tow and returns string "Camping"
        textViewclass1.text = "${truck.make} ${truck.model} ${truck.towingCapacity} ${truck.tow()} ${truck.color()}"

        val motorcycle = Car("Honda","VTX",2010)

        // added the function accelerate
        textViewclass2.text = "${motorcycle.make} ${motorcycle.model} ${motorcycle.year} ${motorcycle.accelerate()}"

        }
    }
// val creates a getter var creates getter and setter
open class Vehicle(val make: String,val model: String){

    open fun accelerate(): String {
        return "Vroom Vroom"
    }

    open fun color(): String {
        return "Red"

    }

}


class Car(make:String,model:String,val year: Int):Vehicle(make,model){

    override fun accelerate(): String {
        return super.accelerate()  // runs the original Vroom Vroom
    }


}

class Truck( make: String,model: String,val towingCapacity:Int):Vehicle(make, model){

    fun tow():String{
        return "Camping"
    }

    override fun color(): String {
        return "Blue"
    }
}


