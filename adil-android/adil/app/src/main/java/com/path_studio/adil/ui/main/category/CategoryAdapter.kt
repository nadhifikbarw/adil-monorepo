package com.path_studio.adil.ui.main.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.databinding.ItemGridCategoryBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private var listCategory = ArrayList<CategoryFragment.Icon>()

    fun setCategories(item: List<CategoryFragment.Icon>?) {
        if (item == null) return
        this.listCategory.clear()
        this.listCategory.addAll(item)
    }

    class CategoryViewHolder(private val binding : ItemGridCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(iconCategory : CategoryFragment.Icon){
            with(binding){
                tvCategoryItemTitle.text = iconCategory.mTitle
                ivCategoryItemIcon.setImageResource(iconCategory.mIcon)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryBinding = ItemGridCategoryBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return CategoryViewHolder(categoryBinding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val items =  listCategory[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }
}