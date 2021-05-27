package com.path_studio.adil.ui.main.bookmark

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.data.database.entity.Bookmark
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.FragmentBookmarkBinding
import com.path_studio.adil.viewModel.ViewModelFactory
import java.util.ArrayList

class BookmarkFragment : Fragment() {

    private var _binding: FragmentBookmarkBinding? = null
    private val binding get() = _binding as FragmentBookmarkBinding
    private val bookmarkAdapter = BookmarkAdapter(this)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentBookmarkBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("OnViewCreated", "Create the view")
        if (activity != null && isAdded) {
            val factory  = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[BookmarkViewModel::class.java]

            Transformations.switchMap(
                viewModel.allBookmarks
            ) { bookmarks ->
                viewModel.getBookmarkedLegislation(bookmarks)
            }.observe(requireActivity()) {
                if(it != null) {
                    bookmarkAdapter.setBookmark(it)
                    bookmarkAdapter.notifyDataSetChanged()
                }
            }

            with(binding.rvListBookmark) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = bookmarkAdapter
            }
            bookmarkAdapter.notifyDataSetChanged()
        }
    }

    override fun onResume() {
        super.onResume()
        bookmarkAdapter.notifyDataSetChanged()
        with(binding.rvListBookmark) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = bookmarkAdapter
        }
    }
}