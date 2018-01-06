package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        //  "==" calls the equals method since we are using a Data Class
        // all the setters and getters are auto compiled

        val productA = Product("Spoon",30.2) //creates Object "A"
        val productB = Product("Spoon",30.2)//creates Object "B"
        val productC = Product("Fork",26.4)//creates Object "C"
        val productD = productC.copy(price = 28.0) // copy the object "C "and change a parameter to make "D"

        txtout.text = "A=A+${(productA==productA).toString()}"
        txtout1.text = "A=B+${(productA==productB).toString()}"
        txtout2.text = "A=C+${(productA==productC).toString()}"
        txtout3.text = "B=C+${(productB==productC).toString()}"
        // toString works on the object
        txtout4.text = productA.toString()
        txtout5.text = productB.toString()
        txtout6.text = productC.toString()
        txtout7.text = productD.toString()


    }
}
// modifying this class as a data class generates methods equals,hashCode,toString and copy
// val or var are permissable val can be copied and the copy changed

data class Product(val name: String, val price: Double) {

}
