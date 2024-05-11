package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class facemask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facemask)

        val sheetmaskimg1: ImageView = findViewById(R.id.sheetmaskimg)
        sheetmaskimg1.setOnClickListener{
            val intent = Intent(this, sheetmask::class.java)
            startActivity(intent)
        }

        val creammaskimg: ImageView = findViewById(R.id.creammaskimg)
        creammaskimg.setOnClickListener{
            val intent = Intent(this, Creammask::class.java)
            startActivity(intent)
        }
        val intomaskimg: ImageView = findViewById(R.id.intomaskimg)
        intomaskimg.setOnClickListener{
            val intent = Intent(this, intromask::class.java)
            startActivity(intent)
        }

        val hedernotfication: ImageView = findViewById(R.id.hedernotfication)
        hedernotfication.setOnClickListener{
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }
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