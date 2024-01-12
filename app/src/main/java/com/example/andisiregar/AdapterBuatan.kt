package com.example.andisiregar

import com.example.andisiregar.R
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterBuatan (private val context: Activity,
                     private val arrayList: ArrayList<databand>) : ArrayAdapter<databand>(context,
    R.layout.activity_jadwal,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.activity_jadwal, null)
        val imageView : ImageView = view.findViewById(R.id.gambar)
        val username : TextView = view.findViewById(R.id.nama)
        val hari : TextView = view.findViewById(R.id.infohari)

        imageView.setImageResource(arrayList[position].imgid)
        username.text = arrayList[position].name
        hari.text = arrayList[position].hari
        return view
    }

}