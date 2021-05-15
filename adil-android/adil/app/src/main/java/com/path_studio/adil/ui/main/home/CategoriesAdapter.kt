package com.path_studio.adil.ui.main.home

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.entity.CategoryEntity
import com.path_studio.adil.databinding.ItemGridCategoryBinding

class CategoriesAdapter(val context: Context, private val listCategories: ArrayList<CategoryEntity>) :
    RecyclerView.Adapter<CategoriesAdapter.GridViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val binding = ItemGridCategoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return GridViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(listCategories[position])
    }

    override fun getItemCount(): Int = listCategories.size

    inner class GridViewHolder(private val binding: ItemGridCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(category: CategoryEntity) {
            binding.imgCategory.setImageResource(
                context.resources.getIdentifier(category.icon, "drawable", context.packageName)
            )
            binding.categoryName.text = category.name
        }
    }
}