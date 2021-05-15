package com.path_studio.adil.ui.main.bookmark

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.databinding.ItemListBookmarkBinding

class BookmarkAdapter : RecyclerView.Adapter<BookmarkAdapter.BookmarkViewModel>() {

    private var listBookmark = ArrayList<BookmarkFragment.Bookmark>()

    fun setBookmark(bookmarks: List<BookmarkFragment.Bookmark>?) {
        if (bookmarks == null) return
        this.listBookmark.clear()
        this.listBookmark.addAll(bookmarks)
    }

    class BookmarkViewModel (private val binding : ItemListBookmarkBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(bookmark : BookmarkFragment.Bookmark){
            with(binding){
                tvBookmarkTitle.text = bookmark.bookmarkTitle
                tvBookmarkDescription.text = bookmark.bookmarkDescription
                tvBookmarkTetap.text = bookmark.bookmarkDitetapkan
                tvBookmarkBerlaku.text = bookmark.bookmarkBerlaku
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