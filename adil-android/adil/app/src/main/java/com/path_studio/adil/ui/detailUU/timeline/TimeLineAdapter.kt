package com.path_studio.adil.ui.detailUU.timeline

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.RelationshipItem
import com.path_studio.adil.databinding.ItemTimelineBinding

class TimeLineAdapter(val context: Context, private val listTimeline: List<RelationshipItem>):
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
        @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
        fun bind(timeline: RelationshipItem, position: Int, lastIndex: Int) {
            with(binding){
                itemYear.text = timeline.tahunPeraturan.toString()
                itemTitle.text = "${timeline.jenisPeraturan} ${timeline.nomorPeraturan} ${timeline.tahunPeraturan}"
                itemDescription.text = timeline.tentang
            }

            when(timeline.type){
                "mengubah" -> {
                    binding.itemIndicator.setBackgroundColor(ContextCompat.getColor(context, R.color.gossip) )
                    binding.itemStatus.text = "Mengubah"
                }
                "mencabut" -> {
                    binding.itemIndicator.setBackgroundColor(ContextCompat.getColor(context, R.color.safety_orange) )
                    binding.itemStatus.text = "Mencabut"
                }
                "diubahOleh" -> {
                    binding.itemIndicator.setBackgroundColor(ContextCompat.getColor(context, R.color.mauve) )
                    binding.itemStatus.text = "Diubah oleh"
                }
                "dicabutOleh" -> {
                    binding.itemIndicator.setBackgroundColor(ContextCompat.getColor(context, R.color.dark_pink) )
                    binding.itemStatus.text = "Dicabut Oleh"
                }
                "this" -> {
                    binding.itemIndicator.setBackgroundColor(ContextCompat.getColor(context, R.color.cerulean) )
                    binding.itemStatus.text = "Sedang dilihat"
                }
            }

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
