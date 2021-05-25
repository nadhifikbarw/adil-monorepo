package com.path_studio.adil.ui.detailUU.information

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.databinding.FragmentInformationBinding
import com.path_studio.adil.ui.detailUU.DetailUUActivity
import com.path_studio.adil.ui.main.MainActivity
import com.path_studio.adil.ui.pdfView.PdfViewActivity
import com.path_studio.adil.ui.pdfView.PdfViewerViewModel
import com.path_studio.adil.viewModel.ViewModelFactory

class InformationFragment : Fragment() {

    private var _binding: FragmentInformationBinding? = null
    private val binding get() = _binding as FragmentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //set binding
        _binding = FragmentInformationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireContext())
        val viewModel = ViewModelProvider(requireActivity(), factory)[InformationViewModel::class.java]

        val extras = activity?.intent?.extras
        if(extras != null) {
            val legisId =extras.getString(DetailUUActivity.EXTRA_LEGISLATION_ID)
            viewModel.selectedLegislation(legisId.toString())
            viewModel.getLegislationDetail().observe(viewLifecycleOwner,{ data ->
                populateDetail(data)
            })
        }

        binding.button.setOnClickListener {
            val intent = Intent(activity as DetailUUActivity, PdfViewActivity::class.java)
            intent.putExtra(PdfViewActivity.EXTRA_LEGISLATION_ID,"11e44c4e281ce9d0947a313231323039")
            startActivity(intent)
        }
    }

    private fun populateDetail(data: LegislationResponse?) {
        with(binding){
            infoJenis.text = data?.jenisPeraturan
            infoJudul.text = data?.tentang
            infoNomor.text = data?.nomorPeraturan
            infoTahun.text = data?.tahunPeraturan.toString()
            infoDitetapkan.text = data?.tglDitetapkan
            infoDiundangkan.text = data?.tglDiundangkan
        }
    }

}