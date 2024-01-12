package com.example.andisiregar// MainActivity.kt
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andisiregar.R
class moreinformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moreinformation)

        val listView: ListView = findViewById(R.id.listview)

        // Contoh data untuk ditampilkan di ListView
        val data = arrayOf("Whats App Admin 1", "Whats App Admin 2", "Email", "Instagram",)

        // Adapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        // Mengatur adapter ke ListView
        listView.adapter = adapter
// Menambahkan listener untuk menangkap klik item di ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = data[position]
            showToast("Anda memilih: $selectedItem")
        }
    }

    // Fungsi untuk menampilkan Toast
    private fun showToast(message: String) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}