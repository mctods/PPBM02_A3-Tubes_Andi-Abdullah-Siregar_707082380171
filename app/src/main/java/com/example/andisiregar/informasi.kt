package com.example.andisiregar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class informasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)
        val btn_info = findViewById<TextView>(R.id.moreinfo)
        btn_info.setOnClickListener {
            val intent = Intent(this, moreinformation::class.java)
            startActivity(intent)
        }
        val btn_back = findViewById<ImageView>(R.id.btnback)
        btn_back.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}