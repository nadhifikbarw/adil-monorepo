package com.path_studio.adil.ui.searchResult

import android.util.Log
import android.os.Bundle
import com.google.gson.Gson
import android.view.Gravity
import com.google.android.gms.tasks.Task
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.path_studio.adil.viewModel.ViewModelFactory
import com.google.firebase.functions.FirebaseFunctions
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.databinding.ActivitySearchResultBinding
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.data.source.remote.response.QueryResponse

class SearchResultActivity : AppCompatActivity() {
    private var drawerLayout: DrawerLayout? = null
    private lateinit var binding: ActivitySearchResultBinding
    private var functions = FirebaseFunctions.getInstance("asia-southeast2")

    companion object{
        const val EXTRA_QUERY = "extra_query"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        if(extras != null) {
            val query = extras.getString(EXTRA_QUERY)

            val factory = ViewModelFactory.getInstance(this)
            val viewModel = ViewModelProvider(this, factory)[SearchResultViewModel::class.java]

            val rvSearchAdapter = SearchResultAdapter(this)

            viewModel.queryLegislation(query.toString()).addOnCompleteListener {
                val hitItems = it.result

                val jumlahPeraturan = "Total ${hitItems?.size} jumlah peraturan"
                binding.textView.text = jumlahPeraturan

                rvSearchAdapter.setLegislation(hitItems)
                rvSearchAdapter.notifyDataSetChanged()
            }

            with(binding.rvListNotification){
                binding.rvListNotification.layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = rvSearchAdapter
            }

        }

        // Set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }

        binding.filterButton.setOnClickListener {
            binding.fragmentSearchResult.openDrawer(Gravity.RIGHT)
        }
    }

}