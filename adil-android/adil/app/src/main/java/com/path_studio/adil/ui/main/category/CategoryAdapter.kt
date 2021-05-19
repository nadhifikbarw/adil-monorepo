package com.path_studio.adil.ui.main.category

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.databinding.ItemGridCategoryBinding
import java.util.*

class CategoryAdapter(val context: Context) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private var listCategory = ArrayList<CategoryResponse>()

    fun setCategories(category: List<CategoryResponse>?) {
        if (category == null) return
        this.listCategory.clear()
        this.listCategory.addAll(category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemsAcademyBinding = ItemGridCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(itemsAcademyBinding)
    }

    @ExperimentalStdlibApi
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = listCategory[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int = listCategory.size

    inner class CategoryViewHolder(private val binding: ItemGridCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        @ExperimentalStdlibApi
        fun bind(category: CategoryResponse) {
            with(binding) {
                val iconName = "ic_${category.id.lowercase()}"
                try {
                    imgCategory.setImageResource(
                        context.resources.getIdentifier(iconName, "drawable", context.packageName)
                    )
                } catch (e: Exception) {
                    //do nothing first
                }

                categoryName.text = category.name
            }
        }
    }

}