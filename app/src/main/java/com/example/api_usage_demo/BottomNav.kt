package com.example.api_usage_demo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)

        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        //Default, HomeFragment should be visible by replacing the main_view with fragment
        replaceWithFragment(HomeFragment())

        bottomView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> replaceWithFragment(HomeFragment())
                R.id.item2 -> replaceWithFragment(SearchFragment())
                R.id.item3 -> replaceWithFragment(ProfileFragment())
                else -> {
                    replaceWithFragment(HomeFragment())
                }
            }
            true
        }

    }

    private fun replaceWithFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()

    }
}