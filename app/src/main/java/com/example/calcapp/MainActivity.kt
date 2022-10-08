package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plus = findViewById<Button>(R.id.button_plus)
        plus.setOnClickListener {
            pressed(true)
        }
        val minus = findViewById<Button>(R.id.button_minus)
        minus.setOnClickListener {
            pressed(false)
        }
    }
    private fun display(text:String) {
        val display = findViewById<TextView>(R.id.textView4)
        display.text = text
    }
    private fun pressed(plus:Boolean) {
        try {
            val t1 = findViewById<EditText>(R.id.left_input).text.toString().toInt()
            val t2 = findViewById<EditText>(R.id.right_input).text.toString().toInt()
            var t3:Int
            println(" $t1 $t2")
            if (plus) {
                t3 = t1 + t2
            } else {
                t3 = t1 - t2
            }
            display(t3.toString())
        } catch (exc:java.lang.NumberFormatException) {
            display("Make sure nums are formatted correctly")
        }
    }
}