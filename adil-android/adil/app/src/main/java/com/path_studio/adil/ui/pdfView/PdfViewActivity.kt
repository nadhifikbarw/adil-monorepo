package com.path_studio.adil.ui.pdfView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.adil.databinding.ActivityPdfViewBinding

class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}