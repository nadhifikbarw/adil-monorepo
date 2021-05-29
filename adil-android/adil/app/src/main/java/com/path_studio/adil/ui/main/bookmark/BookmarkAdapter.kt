package com.path_studio.adil.ui.main.bookmark

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.ItemListBookmarkBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.searchResult.TagsAdapter
import com.path_studio.adil.utils.Utils

class BookmarkAdapter(private val bookmarkFragment: BookmarkFragment) : RecyclerView.Adapter<BookmarkAdapter.BookmarkViewModel>() {

    private var listBookmark = ArrayList<LegislationResponse>()

    fun setBookmark(bookmarks: List<LegislationResponse>?) {
        listBookmark.clear()
        if (bookmarks == null) return
        this.listBookmark.addAll(bookmarks)
        this.notifyDataSetChanged()
    }

    inner class BookmarkViewModel (private val binding : ItemListBookmarkBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(bookmark : LegislationResponse){
            with(binding){
                tvBookmarkTitle.text = "${bookmark.jenisPeraturan} ${bookmark.nomorPeraturan} ${bookmark.tahunPeraturan}"
                tvBookmarkDescription.text = bookmark.tentang
                tvBookmarkTetap.text = "Ditetapkan: ${Utils.changeStringToDateFormat(bookmark.tglDitetapkan.toString())}"
                tvBookmarkBerlaku.text = "Berlaku: ${Utils.changeStringToDateFormat(bookmark.tglDiundangkan.toString())}"
                rvLegislationTags.apply {
                    layoutManager = LinearLayoutManager(context,
                        LinearLayoutManager.HORIZONTAL,false)
                    val tagAdapter = TagsAdapter()
                    tagAdapter.setTags(bookmark.tahunPeraturan.toString(), bookmark.category)
                    adapter = tagAdapter
                }
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailUUActivity::class.java)
                intent.putExtra(DetailUUActivity.EXTRA_LEGISLATION_ID, bookmark.id)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarkViewModel {
        val bookmarkBinding = ItemListBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookmarkViewModel(bookmarkBinding)
    }

    override fun onBindViewHolder(holder: BookmarkViewModel, position: Int) {
        val items = listBookmark[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return listBookmark.size
    }

}