package com.path_studio.adil.ui.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.adil.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener{
            super.onBackPressed()
        }
    }
}