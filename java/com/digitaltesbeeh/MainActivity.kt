package com.digitaltesbeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var appTextin :TextView
    private lateinit var appMainbtn :ImageButton
    private lateinit var appRestbtn :ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appTextin = findViewById(R.id.appTextin)
        appMainbtn = findViewById(R.id.appMainbtn)
        appRestbtn = findViewById(R.id.appRestbtn)

        var countClick = 0
        appMainbtn.setOnClickListener {

            countClick += 1
            appTextin.text = countClick.toString()
        }

        appRestbtn.setOnClickListener {
            countClick=0
            appTextin.text = countClick.toString()
        }
    }

}