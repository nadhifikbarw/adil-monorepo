package com.path_studio.adil.ui.categoryResult

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.path_studio.adil.databinding.ActivityCategoryResultBinding

class CategoryResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryResultBinding

    companion object {
        const val EXTRA_CATEGORY = "extra_category_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras != null) {
            val categoryId = extras.getString(EXTRA_CATEGORY)
            Log.e("Category Id", categoryId.toString())

            //Get Data From Firestore
        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}