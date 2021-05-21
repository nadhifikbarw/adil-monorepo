package com.path_studio.adil.ui.main.category

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.databinding.ItemGridCategoryBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity
import com.path_studio.adil.ui.searchResult.SearchResultActivity
import java.util.*

class CategoryAdapter(val context: Context) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

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

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, CategoryResultActivity::class.java)
                    intent.putExtra(CategoryResultActivity.EXTRA_CATEGORY, category.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

}