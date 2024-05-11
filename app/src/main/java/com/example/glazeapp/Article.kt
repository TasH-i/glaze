package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Article : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val home: ImageView = findViewById(R.id.home)
        home.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val artintro: ImageView = findViewById(R.id.articleintro)
        artintro.setOnClickListener{
            val intent = Intent(this, intromask::class.java)
            startActivity(intent)
        }
        val hydrate1: ImageView = findViewById(R.id.hydrate1)
        hydrate1.setOnClickListener{
            val intent = Intent(this, oilyskin::class.java)
            startActivity(intent)
        }
        val clenceintr: ImageView = findViewById(R.id.clenceintr)
        clenceintr.setOnClickListener{
            val intent = Intent(this, normalskin::class.java)
            startActivity(intent)
        }

    }
}