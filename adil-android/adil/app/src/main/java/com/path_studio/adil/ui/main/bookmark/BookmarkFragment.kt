package com.path_studio.adil.ui.main.bookmark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.R
import com.path_studio.adil.databinding.FragmentBookmarkBinding
import com.path_studio.adil.ui.main.category.CategoryFragment

class BookmarkFragment : Fragment() {

    private var _binding: FragmentBookmarkBinding? = null
    private val binding get() = _binding as FragmentBookmarkBinding

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

        if (activity != null) {
            val bookmarks = dummyData()
            val bookmarkAdapter = BookmarkAdapter()
            bookmarkAdapter.setBookmark(bookmarks)
            with(binding.rvListBookmark) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = bookmarkAdapter
            }
        }
    }

    class Bookmark(
        var bookmarkTitle : String = "",
        var bookmarkDescription : String = "",
        var bookmarkDitetapkan : String = "",
        var bookmarkBerlaku : String = ""
    )

    //Dummy Data
    private fun dummyData() : ArrayList<Bookmark> {
        var items: ArrayList<Bookmark> = ArrayList()

        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )
        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )
        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )
        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )
        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )
        items.add(
            Bookmark(
                "Peraturan Pemerintah Tahun 2020",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral",
                "Ditetapkan : 24 Februari 2020",
                "Berlaku : 26 Februari 2020"
            )
        )


        return items
    }
}