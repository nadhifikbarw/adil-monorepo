package com.path_studio.adil.ui.categoryResult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.adil.databinding.ActivityCategoryResultBinding

class CategoryResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}