package com.path_studio.adil.ui.searchResult

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.path_studio.adil.databinding.ActivitySearchResultBinding

class SearchResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultBinding

    private var drawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }

        binding.filterButton.setOnClickListener {
            binding.fragmentSearchResult.openDrawer(Gravity.RIGHT)
        }

    }
}