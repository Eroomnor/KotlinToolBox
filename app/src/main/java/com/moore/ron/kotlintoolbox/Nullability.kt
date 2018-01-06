package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nullability.*

class Nullability : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nullability)



        buttonnull.setOnClickListener {

            // the "?" after the type allows the var to be null
            var name : String? = editTextnull3.text.toString()
          //  name = null
            // a safe call must be made best way
            textViewnull.text = "${name?.length} Character word "
            // Elvis operator
            textViewnull1.text = "${name?.length ?: 0} Characters long"

                val noName = name ?: "No one knows"
            textViewnull2.text = noName
            // risk of crash with !!
            textViewnull3.text = noName!!.length.toString()
        }


    }
}
