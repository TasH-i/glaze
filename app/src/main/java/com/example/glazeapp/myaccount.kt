package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class myaccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myaccount)

        val contback: ImageView = findViewById(R.id.back)
        contback.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val updateacc: Button = findViewById(R.id.updateacc)
        updateacc.setOnClickListener{
            val intent = Intent(this, updateaccount::class.java)
            startActivity(intent)
        }
    }
}