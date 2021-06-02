package com.path_studio.adil.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.path_studio.adil.R
import com.path_studio.adil.databinding.ActivityMainBinding
import com.path_studio.adil.ui.about.AboutActivity
import com.path_studio.adil.ui.searchResult.SearchResultActivity

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

        binding.searchLegis.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                val intent = Intent(this@MainActivity, SearchResultActivity::class.java)
                intent.putExtra(SearchResultActivity.EXTRA_QUERY, query)
                startActivity(intent)
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }

    private fun setMenuDrawer(){
        drawerLayout = findViewById<View>(R.id.activity_main) as DrawerLayout
        navigationView = findViewById<View>(R.id.nv) as NavigationView
        navigationView!!.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.drawerAbout -> showAboutPage()
                else -> return@OnNavigationItemSelectedListener true
            }
            true
        })
    }

    private fun showAboutPage(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun setBottomNav(){
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(navView, navController)
    }

}