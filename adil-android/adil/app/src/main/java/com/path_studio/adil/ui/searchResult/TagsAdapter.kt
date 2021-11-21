package com.path_studio.adil.ui.searchResult

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.databinding.ItemRowTagsBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity
import java.lang.Integer.parseInt
import java.util.*

class TagsAdapter: RecyclerView.Adapter<TagsAdapter.ViewHolder>(){

    private var listTags = ArrayList<String?>()
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setTags(year: String?, category: List<String?>?) {
        if (category != null){
            this.listTags.clear()
            listTags.add(year)
            this.listTags.addAll(category)
        }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ViewHolder(private val binding : ItemRowTagsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(category: String?){
            binding.tvTags.text = category

            itemView.setOnClickListener {
                onItemClickCallback.onItemClicked(category.toString())
            }
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

    interface OnItemClickCallback {
        fun onItemClicked(data: String)
    }
}