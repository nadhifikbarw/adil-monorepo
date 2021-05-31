package com.path_studio.adil.ui.searchResult

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.databinding.ItemRowSearchResultBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.utils.Utils
import java.util.*

class SearchResultAdapter (val activity: SearchResultActivity) : RecyclerView.Adapter<SearchResultAdapter.ViewHolder>() {

    private var listSearchedLegis = ArrayList<QueryHitItem>()

    fun setLegislation(legislation: List<QueryHitItem>?) {
        if (legislation == null) return
        this.listSearchedLegis.clear()
        this.listSearchedLegis.addAll(legislation)
    }

    inner class ViewHolder(private val binding : ItemRowSearchResultBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(legislation: QueryHitItem) {
            with(binding) {
                tvCardTitle.text =
                    "${legislation.source?.jenisPeraturan} ${legislation.source?.jenisPeraturan} ${legislation.source?.tahunPeraturan}"
                tvCardDescription.text = legislation.source?.tentang
                tvCardTetap.text =
                    "Ditetapkan: ${Utils.changeStringToDateFormat(legislation.source?.tglDitetapkan.toString())}"
                tvCardBerlaku.text = "Berlaku: ${Utils.changeStringToDateFormat(legislation.source?.tglDiundangkan.toString())}"
                rvLegislationTags.apply {
                    layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                    val tagAdapter = TagsAdapter()
                    tagAdapter.setTags(legislation.source?.tahunPeraturan.toString(),
                        legislation.source?.category)
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemsRowSearchResultBinding = ItemRowSearchResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemsRowSearchResultBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = listSearchedLegis[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int {
        return listSearchedLegis.size
    }

}