package com.commandiron.randomnumbergenerator_app_by_command

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 = 0
        var number2 = 0

        generate_btn.setOnClickListener {

            number1 = editTextNumber1.text.toString().toInt()
            number2  = editTextNumber2.text.toString().toInt()

            val randomNumber = (number1..number2).random()

            result_tv.setText("Random Number: " + randomNumber.toString())

        }
    }
}