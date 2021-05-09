package com.path_studio.adil.ui.searchResult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.adil.databinding.ActivitySearchResultBinding

class SearchResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}