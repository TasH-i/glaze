package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class onboading2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboading2)

        val onboard2 : ImageView = findViewById(R.id.onbd2)
        onboard2.setOnClickListener{
            val intent = Intent(this, onboading3::class.java)
            startActivity(intent)
        }
    }
}