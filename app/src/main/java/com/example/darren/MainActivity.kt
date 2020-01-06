package com.example.darren

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll.setOnClickListener{RollFood()}
    }
    private fun RollFood(){
        val food1 = food1.text.toString()
        val food2 = food2.text.toString()
        val food3 = food3.text.toString()

        val x =  (1..3).random()
        if(x == 1){
            result.setText("Today eat "+food1)
        }else if(x == 2){
            result.setText("Today eat "+food2)
        }
        else{
            result.setText("Today eat "+food3)
        }

    }
}
