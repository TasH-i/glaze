package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class onboading1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboading1)

        val next : ImageView = findViewById(R.id.next)
        next.setOnClickListener{
            val intent = Intent(this, onboading2::class.java)
            startActivity(intent)
        }
    }
}