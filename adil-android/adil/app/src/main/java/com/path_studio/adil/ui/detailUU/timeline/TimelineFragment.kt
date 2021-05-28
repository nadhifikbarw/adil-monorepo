package com.path_studio.adil.ui.detailUU.timeline

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.path_studio.adil.data.source.remote.response.RelationshipItem
import com.path_studio.adil.databinding.FragmentTimelineBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.detailUU.information.InformationViewModel
import com.path_studio.adil.ui.pdfView.PdfViewActivity
import com.path_studio.adil.utils.DataDummy
import com.path_studio.adil.viewModel.ViewModelFactory

class TimelineFragment : Fragment() {

    private var _binding: FragmentTimelineBinding? = null
    private val binding get() = _binding as FragmentTimelineBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentTimelineBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireContext())
        val viewModel = ViewModelProvider(requireActivity(), factory)[TimelineViewModel::class.java]

        val extras = activity?.intent?.extras
        if(extras != null) {
            binding.progressBar.visibility = View.VISIBLE
            val docLegisId =extras.getString(DetailUUActivity.EXTRA_LEGISLATION_ID)
            if (docLegisId != null) {
                viewModel.getTimeline(docLegisId).addOnCompleteListener { task ->
                    val timelineList = task.result
                    Log.e("timeLine", timelineList.toString())
                    with(binding){
                        rvTimeline.layoutManager = LinearLayoutManager(activity)
                        rvTimeline.adapter = TimeLineAdapter(requireContext(),
                            timelineList as List<RelationshipItem>
                        )
                    }
                    binding.progressBar.visibility = View.GONE
                }
            }

        }

    }

}