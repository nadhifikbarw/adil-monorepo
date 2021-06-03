package com.path_studio.adil.ui.searchResult

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.functions.FirebaseFunctions
import com.path_studio.adil.databinding.ActivitySearchResultBinding
import com.path_studio.adil.viewModel.ViewModelFactory

class SearchResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultBinding

    companion object {
        const val EXTRA_QUERY = "extra_query"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[SearchResultViewModel::class.java]
        val rvSearchAdapter = SearchResultAdapter(this)

        val extras = intent.extras
        if (extras != null) {
            binding.progressBar.visibility = View.VISIBLE
            val query = extras.getString(EXTRA_QUERY)

            binding.searchLegis.setQuery(query, false)

            viewModel.queryLegislation(query.toString()).addOnCompleteListener {
                val hitItems = it.result

                if (hitItems?.size != 0) {
                    val jumlahPeraturan = "Total ${hitItems?.size} jumlah peraturan"
                    binding.textView.text = jumlahPeraturan

                    binding.progressBar.visibility = View.GONE
                    notFound(false)

                    rvSearchAdapter.setLegislation(hitItems)
                    rvSearchAdapter.notifyDataSetChanged()

                    with(binding.rvListNotification) {
                        binding.rvListNotification.layoutManager = LinearLayoutManager(context)
                        setHasFixedSize(true)
                        adapter = rvSearchAdapter
                    }
                } else {
                    binding.progressBar.visibility = View.GONE
                    notFound(true)
                }

            }
        }

        binding.searchLegis.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {

                viewModel.queryLegislation(query).addOnCompleteListener {
                    val hitItems = it.result

                    if (hitItems?.size != 0) {
                        val jumlahPeraturan = "Total ${hitItems?.size} jumlah peraturan"
                        binding.textView.text = jumlahPeraturan

                        binding.progressBar.visibility = View.GONE
                        notFound(false)

                        rvSearchAdapter.setLegislation(hitItems)
                        rvSearchAdapter.notifyDataSetChanged()

                        with(binding.rvListNotification) {
                            binding.rvListNotification.layoutManager = LinearLayoutManager(context)
                            setHasFixedSize(true)
                            adapter = rvSearchAdapter
                        }
                    } else {
                        binding.progressBar.visibility = View.GONE
                        notFound(true)
                    }

                }

                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })

        // Set back button listener
        binding.backButton.setOnClickListener {
            finish()
        }

    }

    private fun notFound(flag: Boolean) {
        binding.imgNotFound.isVisible = flag
        binding.tvNotFound.isVisible = flag
        if (flag) {
            binding.rvListNotification.isVisible = false
            binding.textView.isVisible = false
        } else {
            binding.rvListNotification.isVisible = true
            binding.textView.isVisible = true
        }
    }

}