package com.example.biletum

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MainActivity_topAppBar)) { view, insets ->
            view.updatePadding(top = insets.systemWindowInsetTop)
            insets
        }

        toSearchTickets()

        val navigationBarView:NavigationBarView = findViewById(R.id.MainActivity_bottomView)
        navigationBarView.setOnItemSelectedListener { item ->
            when(item.itemId)  {
                R.id.bottom_item_1 -> toSearchTickets()
                R.id.bottom_item_2 -> toMyTickets()
                R.id.bottom_item_3 -> toProfile()
                else -> false

            }
        }
    }

    fun toSearchTickets():Boolean {
        val fragment = SearchFragment()
        supportFragmentManager.beginTransaction().replace(R.id.MainActivity_container, fragment).commit()
        val topAppBar = findViewById<androidx.coordinatorlayout.widget.CoordinatorLayout>(R.id.main_coordinator)
        val toolbar = findViewById<MaterialToolbar>(R.id.MainActivity_topAppBar)
        toolbar.title = "Поиск билетов"
        toolbar.setNavigationIcon(R.drawable.ic_home)
        return true
        }

    fun toProfile():Boolean {
        val fragment = ProfileFragment()
        supportFragmentManager.beginTransaction().replace(R.id.MainActivity_container, fragment).commit()
        return true
    }

    fun toMyTickets():Boolean {
        val fragment = MyTicketsFragment()
        supportFragmentManager.beginTransaction().replace(R.id.MainActivity_container, fragment).commit()
        return true
    }

    }




