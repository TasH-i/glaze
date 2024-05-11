package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class generaltips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generaltips)

        val contback: ImageView = findViewById(R.id.back)
        contback.setOnClickListener{
            val intent = Intent(this, skincare::class.java)
            startActivity(intent)
        }

        val save: ImageView = findViewById(R.id.save)
        save.setOnClickListener{
            val intent = Intent(this, saved::class.java)
            startActivity(intent)
        }
    }
}