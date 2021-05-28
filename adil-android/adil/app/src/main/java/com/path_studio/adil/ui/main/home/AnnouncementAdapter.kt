package com.path_studio.adil.ui.main.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.entity.AnnouncementEntity
import com.path_studio.adil.databinding.ItemRowAnnouncementBinding

class AnnouncementAdapter (private val listAnnouncement: ArrayList<AnnouncementEntity>) :
    RecyclerView.Adapter<AnnouncementAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val binding = ItemRowAnnouncementBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listAnnouncement[position])
    }

    override fun getItemCount(): Int = listAnnouncement.size

    inner class ListViewHolder(private val binding: ItemRowAnnouncementBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(announcement: AnnouncementEntity) {
            binding.tvAnnouncementTitle.text = announcement.title
            binding.tvAnnouncementDetail.text = announcement.detail
            binding.tvAnnouncementStatus.text = announcement.status
        }
    }
}