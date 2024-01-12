package com.example.andisiregar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.andisiregar.R
import com.example.andisiregar.login

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@splashscreen, login::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}