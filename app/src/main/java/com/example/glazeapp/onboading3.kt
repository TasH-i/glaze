package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class onboading3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboading3)

        val onbd3: Button = findViewById(R.id.onbd3)
        onbd3.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        val onbdd3 : ImageView = findViewById(R.id.onbdd3)
        onbdd3.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}