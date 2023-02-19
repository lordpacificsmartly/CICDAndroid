package com.example.cicddroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.nameTextView)
        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        val helloButton = findViewById<Button>(R.id.helloBUtton)
        helloButton.setOnClickListener{
            "Hello${nameEditText.text}".also { greetingTextView.text = it }
        }
    }
}