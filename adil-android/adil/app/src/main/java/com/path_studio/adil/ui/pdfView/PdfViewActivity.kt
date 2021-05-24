package com.path_studio.adil.ui.pdfView

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.firebase.firestore.FirebaseFirestore
import com.krishna.fileloader.FileLoader
import com.krishna.fileloader.listener.FileRequestListener
import com.krishna.fileloader.pojo.FileResponse
import com.krishna.fileloader.request.FileLoadRequest
import com.path_studio.adil.databinding.ActivityPdfViewBinding
import com.path_studio.adil.ui.main.home.HomeViewModel
import com.path_studio.adil.viewModel.ViewModelFactory
import java.io.File


class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding

    companion object{
        val EXTRA_LEGISLATION_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[PdfViewerViewModel::class.java]

        val extras = intent.extras
        if(extras != null) {

            val docLegisId =extras.getString(EXTRA_LEGISLATION_ID)
            viewModel.selectedLegislation(docLegisId.toString())
            viewModel.getLegislationDoc().observe(this,{
                val legisPdf = it?.elementAt(0)
                showDocument(legisPdf)
            })
        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun showDocument(legisPdf: String?) {
        FileLoader.with(this)
            .load(legisPdf,false)
            .fromDirectory("PDFFile", FileLoader.DIR_INTERNAL)
            .asFile(object: FileRequestListener<File> {
                override fun onLoad(request: FileLoadRequest?, response: FileResponse<File>?){
                    val pdfFile = response!!.body
                    binding.pdfView.fromFile(pdfFile).pageFitPolicy(FitPolicy.WIDTH).load()
                }
                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    true
                }
            })
    }


}