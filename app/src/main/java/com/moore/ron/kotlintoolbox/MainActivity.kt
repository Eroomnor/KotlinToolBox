package com.moore.ron.kotlintoolbox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      listView = findViewById(R.id.listview1)

        val drawers= arrayOf("Operators","Syntax","Types","Conditional Logic","IfConditions","For Loops","Functions","More Functions","Arrays","Collections","WhenConditions"
                            ,"Data","Data Destructing","Enum","Text Manipulation","TextIO","Inheritance Overload Data","Interface","Variables","Nullability","Lambda","Classes")

        listView.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,drawers)

        listView.setOnItemClickListener { _,_, i,_ ->

            when{
                drawers[i]=="Syntax"-> {val intent = Intent(this,SyntaxActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Types"->{val intent = Intent(this,TypesActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="IfConditions"->{val intent = Intent(this,IfActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Functions"->{val intent = Intent(this,FunctionsActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="More Functions"->{val intent = Intent(this,Functions2Activity::class.java)
                    startActivity(intent)}
                drawers[i]=="Arrays"->{val intent = Intent(this,ArraysActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Collections"->{val intent = Intent(this,CollectionsActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="WhenConditions"->{val intent = Intent(this, WhenActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Data"->{val intent = Intent(this, DataActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Data Destructing"->{val intent = Intent(this, DestructuringActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Enum"->{val intent = Intent(this, EnumActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Text Manipulation"->{val intent = Intent(this, TextActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Inheritance Overload Data"->{val intent = Intent(this, InheritOverloadActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Interface"->{val intent = Intent(this, InterfaceActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="For Loops"->{val intent = Intent(this, ForActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Variables"->{val intent = Intent(this, Variables::class.java)
                    startActivity(intent)}
                drawers[i]=="Operators"->{val intent = Intent(this, Operators::class.java)
                    startActivity(intent)}
                drawers[i]=="Conditional Logic"->{val intent = Intent(this, ConditionalLogic::class.java)
                    startActivity(intent)}
                drawers[i]=="Nullability"->{val intent = Intent(this, Nullability::class.java)
                    startActivity(intent)}
                drawers[i]=="TextIO"->{val intent = Intent(this, TextIOActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Lambda"->{val intent = Intent(this, LambdaActivity::class.java)
                    startActivity(intent)}
                drawers[i]=="Classes"->{val intent = Intent(this, ClassActivity::class.java)
                    startActivity(intent)}
            }

            Toast.makeText(applicationContext,drawers[i],Toast.LENGTH_SHORT).show()
        }


    }


}
