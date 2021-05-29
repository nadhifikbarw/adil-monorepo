package com.path_studio.adil.ui.searchResult

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.databinding.ItemRowTagsBinding
import java.util.*

class TagsAdapter : RecyclerView.Adapter<TagsAdapter.ViewHolder>(){

    private var listTags = ArrayList<String?>()

    fun setTags(year: String?, category: List<String?>?) {
        if (category != null){
            this.listTags.clear()
            listTags.add(year)
            this.listTags.addAll(category)
        }
    }

    inner class ViewHolder(private val binding : ItemRowTagsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(category: String?){
                binding.tvTags.text = category
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemRowTagsBinding = ItemRowTagsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemRowTagsBinding)    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = listTags[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int {
        return listTags.size
    }
}