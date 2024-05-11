package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class tonerandscrub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tonerandscrub)
        val save: ImageView = findViewById(R.id.save)
        save.setOnClickListener{
            val intent = Intent(this, saved::class.java)
            startActivity(intent)
        }
        val home: ImageView = findViewById(R.id.home)
        home.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val acc: ImageView = findViewById(R.id.acc)
        acc.setOnClickListener{
            val intent = Intent(this, myaccount::class.java)
            startActivity(intent)
        }
    }
}