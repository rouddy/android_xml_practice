package com.algorigo.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headButton = findViewById<Button>(R.id.head_button)
        headButton.setOnClickListener({
            Log.d("TAG", "Head Button Clicked")
            Toast.makeText(this, "Hello Raina!", Toast.LENGTH_SHORT).show()
        })
    }
}