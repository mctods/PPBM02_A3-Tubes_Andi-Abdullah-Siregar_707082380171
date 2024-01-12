package com.example.andisiregar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.andisiregar.fragments.AkunSayaFragment
import com.example.andisiregar.fragments.BerandaFragment
import com.example.andisiregar.fragments.PesananFragment

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val berandaFragment = BerandaFragment()
        val pesananFragment = PesananFragment()
        val akunsayaFragment = AkunSayaFragment()
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        makeCurrentFragment(berandaFragment)
        bottomNavigation.setOnItemSelectedListener  { item ->
            when (item.itemId) {
                R.id.ic_home -> makeCurrentFragment(berandaFragment)
                R.id.ic_history -> makeCurrentFragment(pesananFragment)
                R.id.ic_profile -> makeCurrentFragment(akunsayaFragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}