package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class loading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val postDelayed = Handler().postDelayed({
            val intent = Intent(this, onboading1::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}