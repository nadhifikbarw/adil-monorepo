package com.path_studio.adil.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.path_studio.adil.databinding.FragmentHomeBinding
import com.path_studio.adil.ui.categoryResult.CategoryResultActivity
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.pdfView.PdfViewActivity
import com.path_studio.adil.ui.searchResult.SearchResultActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding as FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        //set temporary quick access
        setTempQA()

        return view
    }

    private fun setTempQA(){
        binding.qaCategoryResult.setOnClickListener {
            val intent = Intent(activity as MainActivity, CategoryResultActivity::class.java)
            startActivity(intent)
        }

        binding.qaDetailUU.setOnClickListener{
            val intent = Intent(activity as MainActivity, DetailUUActivity::class.java)
            startActivity(intent)
        }

        binding.qaPdfView.setOnClickListener{
            val intent = Intent(activity as MainActivity, PdfViewActivity::class.java)
            startActivity(intent)
        }

        binding.qaSearchResult.setOnClickListener{
            val intent = Intent(activity as MainActivity, SearchResultActivity::class.java)
            startActivity(intent)
        }

    }

}