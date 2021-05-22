package com.path_studio.adil.ui.detailUU

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.path_studio.adil.ui.detailUU.information.InformationFragment
import com.path_studio.adil.ui.detailUU.timeline.TimelineFragment

class DetailTabsAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = InformationFragment()
            1 -> fragment = TimelineFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 2
    }
}