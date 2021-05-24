package com.path_studio.adil.ui.categoryResult

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.databinding.ActivityCategoryResultBinding
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.main.home.HomeCategoriesAdapter
import com.path_studio.adil.ui.main.home.HomeViewModel
import com.path_studio.adil.viewModel.ViewModelFactory

class CategoryResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryResultBinding

    companion object {
        const val EXTRA_CATEGORY = "extra_category"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if (extras != null) {
            val categoryName = extras.getString(EXTRA_CATEGORY)

            //Get Data From Firestore
            val resultAdapter = CategoriesResultAdapter(this)

            val factory = ViewModelFactory.getInstance(this)
            val viewModel = ViewModelProvider(this, factory)[CategoryResultViewModel::class.java]

            binding.progressBar.visibility = View.VISIBLE
            viewModel.getLegislationResult(categoryName.toString()).observe(this, { legislation ->
                binding.progressBar.visibility = View.GONE

                binding.categoryName.text = categoryName.toString()

                val jumlahPeraturan = "${legislation.size} jumlah peraturan"
                binding.totalCategoryResult.text = jumlahPeraturan

                resultAdapter.setLegislation(legislation)
                resultAdapter.notifyDataSetChanged()
            })

            with(binding.rvListNotification){
                binding.rvListNotification.layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = resultAdapter
            }
        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}