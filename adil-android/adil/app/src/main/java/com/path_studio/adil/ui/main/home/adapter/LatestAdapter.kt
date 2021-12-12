package com.path_studio.adil.ui.main.home.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.ItemRowLatestBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.main.MainActivity

class LatestAdapter (private val activity: Activity) :
    RecyclerView.Adapter<LatestAdapter.ListViewHolder>() {

    private var listLatestUpdate= java.util.ArrayList<LegislationResponse>()

    fun setLatestUpdate(latestData: List<LegislationResponse>?) {
        if (latestData == null) return
        this.listLatestUpdate.clear()
        this.listLatestUpdate.addAll(latestData)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val binding = ItemRowLatestBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return ListViewHolder(activity, binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listLatestUpdate[position])
    }

    override fun getItemCount(): Int = listLatestUpdate.size

    inner class ListViewHolder(private val activity:Activity ,private val binding: ItemRowLatestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
        fun bind(legislation: LegislationResponse) {
            binding.rvAnnouncementTitle.text = "${legislation.jenisPeraturan} ${legislation.nomorPeraturan} ${legislation.tahunPeraturan}"
            binding.rvAnnouncementDetail.text = legislation.tentang

            //status logic
            if(!legislation.mencabut.isNullOrEmpty()) {
                binding.rvAnnouncementStatus.text = activity.resources.getString(R.string.mencabut)
            }else if(!legislation.mengubah.isNullOrEmpty()){
                binding.rvAnnouncementStatus.text = activity.resources.getString(R.string.mengubah)
            }else if(!legislation.dicabutOleh.isNullOrEmpty()){
                binding.rvAnnouncementStatus.text = activity.resources.getString(R.string.dicabut)
            }else if(!legislation.diubahOleh.isNullOrEmpty()){
                binding.rvAnnouncementStatus.text = activity.resources.getString(R.string.diubah)
            }else{
                binding.rvAnnouncementStatus.text = activity.resources.getString(R.string.ditetapkan)
            }

            binding.rvContainer.setOnClickListener {
                val intent = Intent(activity, DetailUUActivity::class.java)
                intent.putExtra(DetailUUActivity.EXTRA_LEGISLATION_ID, legislation.id)
                activity.startActivity(intent)
            }

        }
    }
}