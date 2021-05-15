package com.path_studio.adil.ui.detailUU.timeline

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.entity.TimeLineEntity
import com.path_studio.adil.databinding.ItemTimelineBinding

class TimeLineAdapter(val context: Context, private val listTimeline: List<TimeLineEntity>):
    RecyclerView.Adapter<TimeLineAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val binding = ItemTimelineBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTimeline[position], position, listTimeline.size -1)
    }

    override fun getItemCount(): Int = listTimeline.size

    inner class ViewHolder(private val binding: ItemTimelineBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(timeline: TimeLineEntity, position: Int, lastIndex: Int) {
            binding.itemYear.text = timeline.year.toString()
            binding.itemTitle.text = timeline.title
            binding.itemDescription.text = timeline.detail

            when (position) {
                0 -> binding.timeline.initLine(1)
                lastIndex -> binding.timeline.initLine(2)
                else -> {
                    binding.timeline.initLine(0)
                }
            }

        }
    }
}
