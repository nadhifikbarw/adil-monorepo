package com.path_studio.adil.ui.main

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.path_studio.adil.R
import com.path_studio.adil.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var drawerLayout: DrawerLayout? = null
    private var navigationView: NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Setting the Bottom Navigator
        setBottomNav()

        //Setting drawer for menu
        setMenuDrawer()

        binding.menuButton.setOnClickListener {
            drawerLayout?.openDrawer(Gravity.LEFT)
        }
    }

    private fun setMenuDrawer(){
        drawerLayout = findViewById<View>(R.id.activity_main) as DrawerLayout

        navigationView = findViewById<View>(R.id.nv) as NavigationView
        navigationView!!.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId
            when (id) {
                R.id.drawerAbout -> Toast.makeText(this@MainActivity, R.string.drawer_menu_01, Toast.LENGTH_SHORT)
                    .show()
                R.id.drawerPrivacyPolicy -> Toast.makeText(this@MainActivity, R.string.drawer_menu_02, Toast.LENGTH_SHORT)
                    .show()
                R.id.drawerSettings -> Toast.makeText(this@MainActivity, R.string.drawer_menu_03, Toast.LENGTH_SHORT)
                    .show()
                else -> return@OnNavigationItemSelectedListener true
            }
            true
        })
    }

    private fun setBottomNav(){
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_home,
            R.id.navigation_category,
            R.id.navigation_bookmark
        ).build()
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(navView, navController)
    }

}