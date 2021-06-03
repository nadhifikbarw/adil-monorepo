package com.path_studio.adil.ui.pdfView

import android.R
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.android.material.snackbar.Snackbar
import com.krishna.fileloader.FileLoader
import com.krishna.fileloader.listener.FileRequestListener
import com.krishna.fileloader.pojo.FileResponse
import com.krishna.fileloader.request.FileLoadRequest
import com.path_studio.adil.databinding.ActivityPdfViewBinding
import com.path_studio.adil.viewModel.ViewModelFactory
import java.io.File


class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_LEGISLATION_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val parentLayout = findViewById<View>(R.id.content)

        Snackbar.make(binding.root,"Double-touch to zoom PDF", Snackbar.LENGTH_SHORT).show()

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[PdfViewerViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            binding.progressBar.visibility = View.VISIBLE

            val title = extras.getString(EXTRA_TITLE)
            binding.tvTitlePdfview.text = title

            val docLegisId = extras.getString(EXTRA_LEGISLATION_ID) as String
            Log.d("Isi dari ID : ", docLegisId)

            with(viewModel) {
                selectedLegislation(docLegisId)
                getSignedUrl().addOnCompleteListener { task ->
                    val url = task.result
                    Log.d("isi dari URL :", url.toString())
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
                    binding.progressBar.visibility = View.GONE
                }

                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    true
                }
            })
    }
}