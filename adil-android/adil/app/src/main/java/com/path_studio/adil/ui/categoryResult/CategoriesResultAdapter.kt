package com.path_studio.adil.ui.categoryResult

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.ItemRowSearchResultBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.searchResult.TagsAdapter
import com.path_studio.adil.utils.Utils
import java.util.*

class CategoriesResultAdapter (val activity: CategoryResultActivity) :
    RecyclerView.Adapter<CategoriesResultAdapter.ResultViewHolder>() {
    private var listLegislation = ArrayList<LegislationResponse>()

    fun setLegislation(legislation: List<LegislationResponse>?) {
        if (legislation == null) return
        this.listLegislation.clear()
        this.listLegislation.addAll(legislation)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val itemsRowSearchResultBinding = ItemRowSearchResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(itemsRowSearchResultBinding)
    }

    @ExperimentalStdlibApi
    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        val category = listLegislation[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int = listLegislation.size

    inner class ResultViewHolder(private val binding: ItemRowSearchResultBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
        @ExperimentalStdlibApi
        fun bind(legislation: LegislationResponse) {
            with(binding) {
                tvCardTitle.text = "${legislation.jenisPeraturan} ${legislation.nomorPeraturan} ${legislation.tahunPeraturan}"
                tvCardDescription.text = legislation.tentang
                tvCardTetap.text = "Ditetapkan: ${Utils.changeStringToDateFormat(legislation.tglDitetapkan.toString() )}"
                tvCardBerlaku.text = "Berlaku: ${Utils.changeStringToDateFormat(legislation.tglDiundangkan.toString())}"
                rvLegislationTags.apply {
                    layoutManager = LinearLayoutManager(context,
                        LinearLayoutManager.HORIZONTAL,false)
                    val tagAdapter = TagsAdapter()
                    tagAdapter.setTags(legislation.tahunPeraturan.toString(),
                                        legislation.category)
                    adapter = tagAdapter
                }

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailUUActivity::class.java)
                    intent.putExtra(DetailUUActivity.EXTRA_LEGISLATION_ID, legislation.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}