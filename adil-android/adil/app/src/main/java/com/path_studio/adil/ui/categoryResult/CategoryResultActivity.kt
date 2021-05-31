package com.path_studio.adil.ui.categoryResult

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.databinding.ActivityCategoryResultBinding
import com.path_studio.adil.ui.searchResult.SearchResultActivity
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

            binding.skeletonLayout.showSkeleton()
            viewModel.getLegislationResult(categoryName.toString()).observe(this, { legislation ->
                binding.skeletonLayout.showOriginal()

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

        binding.searchLegis.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                val intent = Intent(this@CategoryResultActivity, SearchResultActivity::class.java)
                intent.putExtra(SearchResultActivity.EXTRA_QUERY, query)
                startActivity(intent)
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })


        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}