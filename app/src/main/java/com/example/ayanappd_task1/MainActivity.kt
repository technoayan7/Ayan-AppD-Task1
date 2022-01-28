package com.example.ayanappd_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt:TextView=findViewById(R.id.name)
        val roll:TextView=findViewById(R.id.roll)
        val btn: Button =findViewById(R.id.button)
        btn.setOnClickListener {
            val str1: String = txt.text.toString()
            val str2: String = roll.text.toString()


            if (str1.equals("", ignoreCase = true) ) {
                Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Hey $str1, Go Corona Go", Toast.LENGTH_SHORT).show()
            }
        }

    }
}