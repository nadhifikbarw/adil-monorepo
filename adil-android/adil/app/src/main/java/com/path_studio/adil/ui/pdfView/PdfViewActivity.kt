package com.path_studio.adil.ui.pdfView

import java.io.File
import android.os.Bundle
import com.krishna.fileloader.FileLoader
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import com.krishna.fileloader.pojo.FileResponse
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.krishna.fileloader.request.FileLoadRequest
import com.path_studio.adil.viewModel.ViewModelFactory
import com.krishna.fileloader.listener.FileRequestListener
import com.path_studio.adil.databinding.ActivityPdfViewBinding


class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding

    companion object {
        val EXTRA_LEGISLATION_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[PdfViewerViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val docLegisId = extras.getString(EXTRA_LEGISLATION_ID) as String
            with(viewModel) {
                selectedLegislation(docLegisId)
                getSignedUrl(docLegisId).addOnCompleteListener { task ->
                    val url = task.result
                    showDocument(url)
                }

                // Set back button listener
                binding.backButton.setOnClickListener {
                    super.onBackPressed()
                }
            }

        }
    }

    private fun showDocument(legisPdf: String?) {
        FileLoader.with(this)
            .load(legisPdf, false)
            .fromDirectory("PDFFile", FileLoader.DIR_INTERNAL)
            .asFile(object : FileRequestListener<File> {
                override fun onLoad(
                    request: FileLoadRequest?,
                    response: FileResponse<File>?
                ) {
                    val pdfFile = response!!.body
                    binding.pdfView.fromFile(pdfFile).pageFitPolicy(FitPolicy.WIDTH).load()
                }

                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    true
                }
            })
    }
}