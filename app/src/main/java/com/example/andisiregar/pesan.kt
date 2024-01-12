package com.example.andisiregar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.andisiregar.fragments.BerandaFragment
import de.hdodenhof.circleimageview.CircleImageView

class pesan : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val spinner: Spinner = findViewById(R.id.spinner)
        val items = arrayOf("Tiket Hari - 1", "Tiket Hari - 2", "Tiket Hari - 3", "Tiket 3 Hari")


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val btn_pesan = findViewById<Button>(R.id.Pesan)
        btn_pesan.setOnClickListener {
            val intent = Intent(this, splashscreen2::class.java)
            startActivity(intent)
        }
        val btn_back = findViewById<ImageView>(R.id.btnback)
        btn_back.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.thebeatlesimageslide,"John Lennon CS siap untuk AndiFest !"))
        imageList.add(SlideModel(R.drawable.rollingstonesimageslide,"Tanggapan Rolling Stones tentang AndiFest !"))
        imageList.add(SlideModel(R.drawable.bobmarleyimageslide,"Bob Marley siap tebarkan perdamaian di AndiFest nanti !"))
        imageList.add(SlideModel(R.drawable.johnlennonimageslide,"'AndiFest merupakan festival musik terbesar di abad ini' - John Lennon !"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}