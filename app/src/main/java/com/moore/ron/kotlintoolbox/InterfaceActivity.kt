package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interface.*

class InterfaceActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        // this passes the arg email to User which inherits from EmailProvider
        val user = User("Nevae@test.com")

        // This calls the function validateEmail in EmailProvider because User inherits EmailProvider
        if (user.validateEmail()) {
            textViewout.text = "Nickname is"
        }else{
            textViewout.text = "No nickname "
        }

        textViewout1.text= user.nickname



    }
}

 // The class User is inheriting from the Interface EmailProvider
// the properety is overridden in the parameter
// the method is overridden in the implementation note override in the arg email
class User(override val email:String):EmailProvider

