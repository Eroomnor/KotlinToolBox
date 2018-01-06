package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lambda.*

class LambdaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda)

        // a function is assigned to the val printMessage message is the arg and setText is the function
        val printMessage = {message: String -> textViewLambda.setText(message) }
        printMessage("Hello Lambda")

        val sum2 = {x:Float, y:Float -> x+y}
        textViewLambda1.text = (sum2(18F, 6F).toString())

        // here a Lambda is used to run code after the completion of another task "Download for example"
        fun downloadData(url:String, completion:()-> Unit) {
        // fake send a request
            // get it back
            completion()
        }
        // call downloadFunction
        downloadData("fakeUrl.com",{textViewLambda2.text= "Fake Data Downloaded"})


        // here an object is created with three args

        fun downloadcarData(url:String,completion:(Car)-> Unit){
            // fake request
            // get it back
            val car = Car("Tesla", "X", "Blue" )
            completion(car)
        }

        // call the function and access the variables
        downloadcarData("FakeUrl.com"){car ->
            textViewLambda3.text = "${car.make} ${car.model} ${car.color}"
        }

        // If only one parameter "(Car)" is passed the the code can be changed to this...
        downloadcarData("FakeUrl.com"){
            textViewLambda3.text = "${it.make} ${it.model} ${it.color}"
        }

        fun downloadTruckData(url:String,completion:(Truck?,Boolean)-> Unit){
            // fake request
            // get it back
            val request = false // make a problem for or test on line 63
            if (request) {
                // got the request
                val truck = Truck("Chevy", "Colorado", 10000)
                completion(truck, true)
            }else{
                completion(null,false)
            }
        }
            // call truckData
        downloadTruckData("fakeUrl"){ truck, success ->
            if (success == true){
                // do some code
                textViewLambda4.text = "Cruising"
            }else{
                // handle problem with download
                textViewLambda4.text ="Truck Download failed"
            }

        }


    }

    class Car(var make: String, var model: String, var color: String) {}

    class Truck(var make: String,var model: String,var towcap:Int){
        init {
            val towtext ="Cruising down the road"
        }

    }
}




