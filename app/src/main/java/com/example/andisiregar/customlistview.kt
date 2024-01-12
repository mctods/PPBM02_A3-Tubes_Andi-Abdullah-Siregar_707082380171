package com.example.andisiregar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import com.example.andisiregar.AdapterBuatan
import com.example.andisiregar.R
import com.example.andisiregar.databinding.ActivityCustomlistviewBinding
import com.example.andisiregar.databinding.ActivityMainBinding


class customlistview : AppCompatActivity() {

    private lateinit var binding: ActivityCustomlistviewBinding
    private lateinit var profilbandArrayList : ArrayList<databand>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomlistviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.thebeatles,
            R.drawable.rollingstones,
            R.drawable.bobmarley,
            R.drawable.jimihendrix,
            R.drawable.sexpistols,
            R.drawable.ramones,
            R.drawable.koesplus,
            R.drawable.panbers,
            R.drawable.rhcp,
            R.drawable.nirvanaa

        )

        val name = arrayOf(
            "The Beatles",
            "Rolling Stones",
            "Bob Marley and The Wailers",
            "Jimi Hendrix Experience",
            "Sex Pistols",
            "Ramones",
            "Koes Plus",
            "Panbers",
            "Red Hot Chili Peppers",
            "Nirvana"
        )

        val hari = arrayOf(
            "Hari 1",
            "Hari 1",
            "Hari 1",
            "Hari 1",
            "Hari 2",
            "Hari 2",
            "Hari 2",
            "Hari 3",
            "Hari 3",
            "Hari 3"
        )

        val stage = arrayOf(
            "Stage 1",
            "Stage 1",
            "Stage 2",
            "Stage 2",
            "Stage 1",
            "Stage 1",
            "Stage 2",
            "Stage 2",
            "Stage 1",
            "Stage 1"
        )

        val jammain = arrayOf(
            "19.00-19.30",
            "19.30-20.00",
            "19.00-19.30",
            "19.30-20.00",
            "19.00-19.30",
            "19.30-20.00",
            "19.00-19.30",
            "19.30-20.00",
            "19.00-19.30",
            "19.30-20.00"
        )

        profilbandArrayList = ArrayList()

        for (i in name.indices){

            val profilband = databand(name[i], hari[i], stage[i], jammain[i], imageId[i])
            profilbandArrayList.add(profilband)
        }
        binding.listview3.isClickable = true
        binding.listview3.adapter = AdapterBuatan(this, profilbandArrayList)
        binding.listview3.setOnItemClickListener { parent, view, position, id ->

            val name = profilbandArrayList[position].name
            val stage = profilbandArrayList[position].stage
            val jammain = profilbandArrayList[position].jammain
            val imageId = profilbandArrayList[position].imgid


            val i = Intent(this, profilband::class.java)
            i.putExtra("name",name)
            i.putExtra("stage",stage)
            i.putExtra("jammain",jammain)
            i.putExtra("imageId",imageId)
            startActivity(i)

        }

        val btn_back = findViewById<ImageView>(R.id.btnback)
        btn_back.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}