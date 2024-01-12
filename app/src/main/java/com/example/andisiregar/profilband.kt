package com.example.andisiregar

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andisiregar.databinding.ActivityProfilbandBinding

class profilband : AppCompatActivity() {

    private lateinit var binding : ActivityProfilbandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilbandBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val stage = intent.getStringExtra("stage")
        val jammain = intent.getStringExtra("jammain")
        val imageId = intent.getIntExtra("imageId", R.drawable.fotoprofil)

        binding.namaTextView.text = name
        binding.tempatTextView.text = stage
        binding.jadwalTextView.text = jammain
        binding.fotoImageView.setImageResource(imageId)
    }
}