package com.path_studio.adil.ui.detailUU

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.path_studio.adil.R
import com.path_studio.adil.databinding.ActivityDetailUuActivityBinding

class DetailUUActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUuActivityBinding

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.detailTab01,
            R.string.detailTab02
        )

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set Tab
        setTab()

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setTab(){
        val sectionsPagerAdapter = DetailTabsAdapter(this)
        val viewPager: ViewPager2 = binding.detailViewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.detailTab
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
        supportActionBar?.elevation = 0f
    }
}