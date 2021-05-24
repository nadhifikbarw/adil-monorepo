package com.path_studio.adil.ui.main.category

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.databinding.ItemGridCategoryBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity
import com.path_studio.adil.ui.main.MainActivity
import java.util.*

class CategoryAdapter(val activity: MainActivity) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

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
                Glide.with(activity)
                    .load(category.icon)
                    .transform(RoundedCorners(20))
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgCategory)

                categoryName.text = category.name

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, CategoryResultActivity::class.java)
                    intent.putExtra(CategoryResultActivity.EXTRA_CATEGORY, category.name)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

}