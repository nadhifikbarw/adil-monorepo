package com.path_studio.adil.ui.detailUU

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.path_studio.adil.R
import com.path_studio.adil.databinding.ActivityDetailUuActivityBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity

class DetailUUActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUuActivityBinding

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.detailTab01,
            R.string.detailTab02
        )

        private val TAB_ICONS = intArrayOf(
            R.drawable.ic_information_blue,
            R.drawable.ic_timeline
        )

        const val EXTRA_LEGISLATION_ID = "extra_legislation_id"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set Tab
        setTab()

        val extras = intent.extras
        if (extras != null) {
            val legislationId = extras.getString(EXTRA_LEGISLATION_ID)
        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setTab(){
        binding.detailTab.setSelectedTabIndicatorColor(this.getColor(R.color.cerulean))
        binding.detailTab.setTabTextColors(this.getColor(R.color.white), this.getColor(R.color.cerulean))

        val sectionsPagerAdapter = DetailTabsAdapter(this)
        val viewPager: ViewPager2 = binding.detailViewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.detailTab
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
            tab.icon = ContextCompat.getDrawable(this, TAB_ICONS[position])
        }.attach()
        supportActionBar?.elevation = 0f
    }
}