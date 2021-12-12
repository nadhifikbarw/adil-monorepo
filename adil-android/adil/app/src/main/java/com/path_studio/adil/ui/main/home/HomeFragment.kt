package com.path_studio.adil.ui.main.home

import android.annotation.SuppressLint
import android.content.Context
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
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.FragmentHomeBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.main.home.adapter.HomeBannerSlideAdapter
import com.path_studio.adil.ui.main.home.adapter.HomeCategoriesAdapter
import com.path_studio.adil.ui.main.home.adapter.LatestAdapter
import com.path_studio.adil.ui.searchResult.TagsAdapter
import com.path_studio.adil.utils.Utils
import com.path_studio.adil.viewModel.ViewModelFactory
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

    private lateinit var factory: ViewModelFactory
    private lateinit var viewModel:HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val bannerAnimation = AnimationUtils.loadAnimation(requireContext(),R.anim.drop_animation)
//        val kategoriAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.drop_animation)
//        kategoriAnimation.startOffset = 400

        //Setting Home Banner Slide Show
        showHomeBanner()
//        binding.constraintLayout2.startAnimation(bannerAnimation)

//        binding.textView5.startAnimation(kategoriAnimation)
//        binding.rvCategories.startAnimation(kategoriAnimation)

        if(activity!= null){
            showCategory()

            //set rv for categories & announcement
            setAnnouncement()

        }

    }

    override fun onResume() {
        super.onResume()

        //show or hide last seen
        val sharedPref = requireActivity().getSharedPreferences(
            "com.path_studio.adil", Context.MODE_PRIVATE)
        with(binding){
            if(!sharedPref.contains("lastLegisId")){
                textView8.visibility = View.GONE
                lastSeenContainer.cardContainer.visibility = View.GONE
            }else{
                val legistId = sharedPref.getString("lastLegisId", "")
                textView8.visibility = View.VISIBLE
                lastSeenContainer.cardContainer.visibility = View.VISIBLE

                //show the data from firebase
                if (legistId != null && legistId.isNotEmpty()) {
                    viewModel.getLegislationDetail(legistId).observe(viewLifecycleOwner,{ data ->
                        showLastViewData(data)
                    })
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showLastViewData(legislation: LegislationResponse){
        with(binding.lastSeenContainer){
            tvCardTitle.text = "${legislation.jenisPeraturan} ${legislation.nomorPeraturan} ${legislation.tahunPeraturan}"
            tvCardDescription.text = legislation.tentang
            if(legislation.tglDitetapkan.toString() == ""){
                tvCardTetap.text = "Ditetapkan: -"
            }else{
                tvCardTetap.text = "Ditetapkan: ${Utils.changeStringToDateFormat(legislation.tglDitetapkan.toString() )}"
            }

            if(legislation.tglDiundangkan.toString() == "") {
                tvCardBerlaku.text =
                    "Berlaku: -"
            }else{
                tvCardBerlaku.text =
                    "Berlaku: ${Utils.changeStringToDateFormat(legislation.tglDiundangkan.toString())}"
            }
            rvLegislationTags.apply {
                layoutManager = LinearLayoutManager(context,
                    LinearLayoutManager.HORIZONTAL,false)
                val tagAdapter = TagsAdapter()
                tagAdapter.setTags(legislation.tahunPeraturan.toString(),
                    legislation.category)
                tagAdapter.setOnItemClickCallback(object: TagsAdapter.OnItemClickCallback {
                    override fun onItemClicked(data: String) {
                        //show category result
                        val intent = Intent(requireActivity(), CategoryResultActivity::class.java)
                        intent.putExtra(CategoryResultActivity.EXTRA_CATEGORY, data)
                        requireActivity().startActivity(intent)
                    }
                })
                adapter = tagAdapter
            }

            cardContainer.setOnClickListener {
                val intent = Intent(requireActivity(), DetailUUActivity::class.java)
                intent.putExtra(DetailUUActivity.EXTRA_LEGISLATION_ID, legislation.id)
                requireActivity().startActivity(intent)
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun showCategory(){
        val categoryAdapter = HomeCategoriesAdapter(activity as MainActivity)

        factory = ViewModelFactory.getInstance(requireActivity())
        viewModel = ViewModelProvider(this, factory)[HomeViewModel::class.java]

        binding.skeletonLayout.showSkeleton()
        viewModel.getHomeCategories().observe(requireActivity(), { category ->
            binding.skeletonLayout.showOriginal()
            categoryAdapter.setCategories(category)
            categoryAdapter.notifyDataSetChanged()
        })

        with(binding.rvCategories){
            layoutManager = GridLayoutManager(context,4,
                LinearLayoutManager.VERTICAL,false)
            setHasFixedSize(true)
            adapter = categoryAdapter
        }
    }

    private fun setAnnouncement(){
        viewModel.getLatestUpdates(5).observe(viewLifecycleOwner,{ data ->
            binding.skeletonLayout.showSkeleton()

            val latestAdapter = LatestAdapter(requireActivity())
            latestAdapter.setLatestUpdate(data)
            with(binding.rvAnnouncement) {
                binding.rvAnnouncement.layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = latestAdapter

                binding.skeletonLayout.showOriginal()
            }
        })
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