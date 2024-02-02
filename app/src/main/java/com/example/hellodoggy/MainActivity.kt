package com.example.hellodoggy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Hello) // Reference the views in the layout
        button.setOnClickListener {// Receives a notice that button has been clicked
            Log.v("Hello World", "Button clicked")// Output in logcat the text to show button was clicked
            Toast.makeText(this,"Hello to you!", Toast.LENGTH_SHORT).show()
        }
    }
}