package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inherit_overload.*

class InheritOverloadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inherit_overload)

        btn1.setOnClickListener {

            val myTree = Tree()
            textViewout.text = myTree.height.toString()
            myTree.grow(12)
            textViewout1.text = myTree.height.toString()
        }

        /*      To quickly override any member go to the class where it is declared, add the
        open modifier then go to the class where it is being run and press cntrl O

         */
        btn2.setOnClickListener {
            val myTree = Tree()
            val myheigth = Plant()
            myheigth.height =30
            myTree.grow(10)
            textViewout.text = myTree.height.toString()
            textViewout1.text = myheigth.height.toString()
        }


    }
}
