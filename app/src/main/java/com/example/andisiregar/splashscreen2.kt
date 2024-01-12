package com.example.andisiregar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen2)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@splashscreen2, com.example.andisiregar.MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}