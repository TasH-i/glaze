package com.example.glazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class skincare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skincare)

        val normalskin2 : ImageView = findViewById(R.id.normalskin1)
        normalskin2.setOnClickListener {
            val intent = Intent(this, normalskin::class.java)
            startActivity(intent)
        }

        val dryskin3: ImageView = findViewById(R.id.dryskin1)
        dryskin3.setOnClickListener{
            val intent = Intent(this, dryskin::class.java)
            startActivity(intent)
        }

        val oilyskin3: ImageView = findViewById(R.id.oilyskin1)
        oilyskin3.setOnClickListener{
            val intent = Intent(this, oilyskin::class.java)
            startActivity(intent)
        }

        val generaltip: ImageView = findViewById(R.id.generaltip1)
        generaltip.setOnClickListener{
            val intent = Intent(this, generaltips::class.java)
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
