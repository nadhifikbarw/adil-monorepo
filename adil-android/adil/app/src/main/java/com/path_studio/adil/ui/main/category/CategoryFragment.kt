package com.path_studio.adil.ui.main.category

import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.path_studio.adil.R
import com.path_studio.adil.databinding.FragmentCategoryBinding
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.main.home.HomeViewModel
import com.path_studio.adil.viewModel.ViewModelFactory

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding as FragmentCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Set Grid Layout & RecyclerView
        if(activity!= null){
            val categoryAdapter = CategoryAdapter(activity as MainActivity)

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[CategoryViewModel::class.java]

            binding.skeletonLayout.showSkeleton()
            viewModel.getAllCategories().observe(requireActivity(), { category ->
                binding.skeletonLayout.showOriginal()
                categoryAdapter.setCategories(category)
                categoryAdapter.notifyDataSetChanged()
            })

            with(binding.rvListCategory){
                layoutManager = GridLayoutManager(context,3,LinearLayoutManager.VERTICAL,false)
                setHasFixedSize(true)
                adapter = categoryAdapter
            }

        }

    }

}