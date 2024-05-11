package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class updateaccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updateaccount)

        val updatebtn: Button = findViewById(R.id.updatebtn)
        updatebtn.setOnClickListener{
            val intent = Intent(this, myaccount::class.java)
            startActivity(intent)
        }
    }
}