package com.path_studio.adil.ui.pdfView

import android.os.Bundle
import android.util.Log
<<<<<<< HEAD
=======
import android.view.View
>>>>>>> 0ad8ccca012482c42036b32662beaa92be20b243
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.github.barteksc.pdfviewer.util.FitPolicy
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

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[PdfViewerViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
<<<<<<< HEAD
=======
            binding.progressBar.visibility = View.VISIBLE
>>>>>>> 0ad8ccca012482c42036b32662beaa92be20b243

            val title = extras.getString(EXTRA_TITLE)
            binding.tvTitlePdfview.text = title

            val docLegisId = extras.getString(EXTRA_LEGISLATION_ID) as String
            Log.d("Isi dari ID : ", docLegisId)

            with(viewModel) {
                selectedLegislation(docLegisId)
                getSignedUrl(docLegisId).addOnCompleteListener { task ->
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
<<<<<<< HEAD
=======
                    binding.progressBar.visibility = View.GONE
>>>>>>> 0ad8ccca012482c42036b32662beaa92be20b243
                }

                override fun onError(request: FileLoadRequest?, t: Throwable?) {
                    true
                }
            })
    }
}