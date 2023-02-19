package com.example.cicddroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(application, "491c7c6a-fc98-4b51-b808-8a0fc9a667ca", Analytics::class.java, Crashes::class.java)

        val nameEditText = findViewById<EditText>(R.id.nameTextView)
        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        val helloButton = findViewById<Button>(R.id.helloBUtton)
        helloButton.setOnClickListener{
            "Hello${nameEditText.text}".also { greetingTextView.text = it }
        }
    }
}