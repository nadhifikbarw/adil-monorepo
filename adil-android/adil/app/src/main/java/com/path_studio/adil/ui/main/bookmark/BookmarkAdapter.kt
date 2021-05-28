package com.path_studio.adil.ui.main.bookmark

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.R
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.ItemListBookmarkBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
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
                tvBookmarkTags.addView(setButton("${bookmark.tahunPeraturan}"))
                for(category in bookmark.category!!) {
                    tvBookmarkTags.addView(setButton("${category}"))
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

    @SuppressLint("UseCompatLoadingForDrawables")
    fun setButton(value: String): Button {
        //set the properties for button
        val btnTag = Button(bookmarkFragment.activity)

        //set margin and create button
        val params: ActionBar.LayoutParams = ActionBar.LayoutParams(
            ActionBar.LayoutParams.WRAP_CONTENT,
            ActionBar.LayoutParams.WRAP_CONTENT
        )
        params.setMargins(5,5, 20, 5)
        btnTag.layoutParams = ActionBar.LayoutParams(params)
        btnTag.text = value
        btnTag.textSize = 12f
        btnTag.background = bookmarkFragment.activity?.getDrawable(R.drawable.secondary_rounded_button)

        //set padding
        btnTag.setPadding(5, 0, 5, 0)
        btnTag.requestLayout()
        return btnTag
    }

}