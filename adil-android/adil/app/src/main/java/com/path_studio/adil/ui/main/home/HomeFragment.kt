package com.path_studio.adil.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.path_studio.adil.R
import com.path_studio.adil.databinding.FragmentHomeBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.searchResult.SearchResultActivity
import com.path_studio.adil.utils.DataDummy
import java.util.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding as FragmentHomeBinding

    private var sliderAdapter: HomeBannerSlideAdapter? = null
    private var mSlideViewPager: ViewPager? = null
    private var mDotLayout: LinearLayout? = null
    private lateinit var mDosts: Array<TextView>
    private var nCurrentPage = 0
    private var timer: Timer? = null
    private val DELAY_MS: Long = 500 //delay in milliseconds before task is to be executed
    private val PERIOD_MS: Long = 3000 // time in milliseconds between successive task executions.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Setting Home Banner Slide Show
        showHomeBanner()

        //set rv for categories & announcement
        setCategories()
        setAnnouncement()

        binding.btnDetailUU.setOnClickListener {
            val intent = Intent(activity as MainActivity, DetailUUActivity::class.java)
            startActivity(intent)
        }

        binding.btnSearchResult.setOnClickListener{
            val intent = Intent(activity as MainActivity, SearchResultActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setCategories(){
        val categoriesAdapter = CategoriesAdapter(requireContext(), DataDummy.getAllCategories())
        with(binding.rvCategories) {
            binding.rvCategories.layoutManager = GridLayoutManager(activity, 4)
            setHasFixedSize(true)
            adapter = categoriesAdapter
        }
    }

    private fun setAnnouncement(){
        val announcementAdapter = AnnouncementAdapter(DataDummy.getAllAnnouncement())
        with(binding.rvAnnouncement) {
            binding.rvAnnouncement.layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = announcementAdapter
        }
    }

    private fun showHomeBanner(){
        mSlideViewPager = binding.homeBannerContainer
        mDotLayout = binding.dotsLayoutHomeBanner

        sliderAdapter = context?.let { HomeBannerSlideAdapter(it, activity as MainActivity) }
        mSlideViewPager!!.adapter = sliderAdapter

        addDotsIndicator(0)
        mSlideViewPager!!.addOnPageChangeListener(viewListener)

        /*After setting the adapter use the timer */
        val handler = Handler((activity as MainActivity).mainLooper)
        val update = Runnable {
            if (nCurrentPage == 3) {
                nCurrentPage = 0
            }
            mSlideViewPager!!.setCurrentItem(nCurrentPage++, true)
        }

        timer = Timer() // This will create a new Thread
        timer!!.schedule(object : TimerTask() {
            // task to be scheduled
            override fun run() {
                handler.post(update)
            }
        }, DELAY_MS, PERIOD_MS)
    }

    fun addDotsIndicator(position: Int) {
        mDotLayout!!.removeAllViews()
        if (context != null) {
            mDosts = arrayOf(
                TextView(requireContext()), TextView(requireContext()), TextView(requireContext()))
            for (i in mDosts.indices) {
                mDosts[i] = TextView(requireContext())
                mDosts[i].text = Html.fromHtml("&#8226;", 0)
                mDosts[i].textSize = 35f
                mDosts[i].setTextColor(ContextCompat.getColor(requireContext(), R.color.dim_gray))
                mDotLayout!!.addView(mDosts[i])
            }
            mDosts[position].setTextColor(ContextCompat.getColor(requireContext(), R.color.safety_orange))
        }
    }

    private var viewListener: ViewPager.OnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrolled(i: Int, v: Float, i1: Int) {}

        override fun onPageSelected(i: Int) {
            addDotsIndicator(i)
            nCurrentPage = i
        }

        override fun onPageScrollStateChanged(i: Int) {}
    }

}