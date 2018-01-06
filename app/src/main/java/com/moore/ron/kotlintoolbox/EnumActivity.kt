package com.moore.ron.kotlintoolbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_enum.*

class EnumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enum)

        var userdirection = Direction.SOUTH

        txtout.text =
                when(userdirection){
                    Direction.SOUTH-> { "He went South" }
                    Direction.NORTH->{ "He Went North" }
                    Direction.EAST->{ "He Went East" }
                    Direction.WEST->{ "He Went West" }
                }


    }
}

enum class Direction{NORTH,SOUTH,EAST,WEST}
