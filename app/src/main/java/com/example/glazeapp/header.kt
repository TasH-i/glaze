package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class header : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_header)

        val hedernotfication: ImageView = findViewById(R.id.hedernotfication)
        hedernotfication.setOnClickListener{
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }
    }
}