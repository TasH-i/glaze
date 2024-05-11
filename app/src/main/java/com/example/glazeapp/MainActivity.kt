package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skincarebtn: Button = findViewById(R.id.skincarebtn)
        skincarebtn.setOnClickListener{
            val intent = Intent(this, skincare::class.java)
            startActivity(intent)
        }

        val facemaskbtn: Button = findViewById(R.id.facemaskbtn)
        facemaskbtn.setOnClickListener{
            val intent = Intent(this, facemask::class.java)
            startActivity(intent)
        }

        val articlebtn: Button = findViewById(R.id.articlebtn)
        articlebtn.setOnClickListener{
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        val tonerbtn: Button = findViewById(R.id.tonerbtn)
        tonerbtn.setOnClickListener{
            val intent = Intent(this, tonerandscrub::class.java)
            startActivity(intent)
        }

        val contactus: TextView = findViewById(R.id.conus)
        contactus.setOnClickListener{
            val intent = Intent(this, contactus::class.java)
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
        val tttt: ImageView = findViewById(R.id.hedernotfication)
        tttt.setOnClickListener{
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }

    }
}