package com.path_studio.adil.ui.main.home

import android.content.Context
import android.graphics.drawable.PictureDrawable
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.databinding.ItemGridCategoryBinding
import com.path_studio.adil.ui.main.MainActivity
import java.io.InputStream
import java.util.*


class HomeCategoriesAdapter(val activity: MainActivity) :
    RecyclerView.Adapter<HomeCategoriesAdapter.CategoryViewHolder>() {
    private var listCategory = ArrayList<CategoryResponse>()

    fun setCategories(category: List<CategoryResponse>?) {
        if (category == null) return
        this.listCategory.clear()
        this.listCategory.addAll(category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemsCategoryBinding = ItemGridCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(itemsCategoryBinding)
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
                /*val iconName = "ic_${category.id.lowercase()}"
                try {
                    imgCategory.setImageResource(
                        context.resources.getIdentifier(iconName, "drawable", context.packageName)
                    )
                } catch (e: Exception) {
                    //do nothing first
                }*/

                categoryName.text = category.name
            }
        }
    }
}