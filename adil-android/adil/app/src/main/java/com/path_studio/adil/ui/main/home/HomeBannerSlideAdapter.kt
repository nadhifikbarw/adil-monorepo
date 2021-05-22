package com.path_studio.adil.ui.main.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.path_studio.adil.R
import com.path_studio.adil.data.entity.BannerEntity
import com.path_studio.adil.ui.main.MainActivity

class HomeBannerSlideAdapter(val context: Context, val activity: MainActivity): PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private var bannerDataList: ArrayList<BannerEntity> = arrayListOf(
        BannerEntity(
            1,
            "Judul Berita 01",
            "Ini adalah detail berita dari berita 01"
        ),
        BannerEntity(
            2,
            "Judul Berita 02",
            "Ini adalah detail berita dari berita 02"
        ),
        BannerEntity(
            3,
            "Judul Berita 03",
            "Ini adalah detail berita dari berita 03"
        )
    )

    //Arrays
    private var image = intArrayOf(
        R.drawable.home_banner_01,
        R.drawable.home_banner_02,
        R.drawable.home_banner_03
    )

    override fun getCount(): Int {
        return image.size
    }

    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view === o as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater!!.inflate(R.layout.home_banner_slider, container, false)

        val slideImageView = view.findViewById<View>(R.id.home_banner_img) as ImageView
        slideImageView.setImageResource(image[position])

        val slideAppName = view.findViewById<View>(R.id.homeBannerTitle) as TextView
        slideAppName.text = bannerDataList[0].bannerTitle

        val slideDevName = view.findViewById<View>(R.id.homeBannerDetails) as TextView
        slideDevName.text = bannerDataList[0].bannerDetails

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout?)
    }

}