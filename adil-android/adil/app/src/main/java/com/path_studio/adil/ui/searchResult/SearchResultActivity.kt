package com.path_studio.adil.ui.searchResult

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.tasks.Task
import com.google.firebase.functions.FirebaseFunctions
import com.google.gson.Gson
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.data.source.remote.response.QueryResponse
import com.path_studio.adil.databinding.ActivitySearchResultBinding
import com.path_studio.adil.viewModel.ViewModelFactory

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

            queryLegislation(query.toString()).addOnCompleteListener {
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

    private fun queryLegislation(query: String): Task<List<QueryHitItem>> {
        val data = hashMapOf(
            "query" to query
        )

        return functions
            .getHttpsCallable("queryLegislation")
            .call(data)
            .continueWith { task ->
                val resultMap = task.result?.data as Map<String,Any>

                // Cast Map to JSON
                val gson = Gson()
                val json = gson.toJson(resultMap)

                // Extract List of QueryHitItem
                val queryResponse = gson.fromJson(json, QueryResponse::class.java)
                val result = queryResponse.hits.hits
                result
            }
    }
}