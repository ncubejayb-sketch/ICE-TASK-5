package com.example.icetask5

import android.os.Bundle
import android.view.Display
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pro = findViewById<TextView>(R.id.Pro)
        val Here = findViewById<Button>(R.id.Here)
        val Display = findViewById<TextView>(R.id.Display)

        val mark = arrayOf(75,45,62,90,33,55,81,40,67,29)
        Here.setOnClickListener {

            val PassMark =0
            val FailMark =0
            val HighestMark =mark[0]
            val LowestMark =mark[0]

            var output = " "

            for (marks in mark){

                if (marks >= 50){
                    output += "mark $marks ->pass\n"
                    PassMark
                }else{
                    output += "mark $marks ->fail\n"
                    FailMark
                }
            }
        }


    }
}