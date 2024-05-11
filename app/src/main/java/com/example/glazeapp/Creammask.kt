package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Creammask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creammask)

        val contback: ImageView = findViewById(R.id.back)
        contback.setOnClickListener{
            val intent = Intent(this, skincare::class.java)
            startActivity(intent)
        }
    }
}