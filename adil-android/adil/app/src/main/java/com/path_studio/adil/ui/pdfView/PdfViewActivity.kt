package com.path_studio.adil.ui.pdfView

import java.io.File
import android.os.Bundle
import android.util.Log
import com.google.firebase.ktx.Firebase
import com.krishna.fileloader.FileLoader
import com.google.android.gms.tasks.Task
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import com.krishna.fileloader.pojo.FileResponse
import com.google.firebase.functions.ktx.functions
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.krishna.fileloader.request.FileLoadRequest
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.ktx.initialize
import com.path_studio.adil.viewModel.ViewModelFactory
import com.krishna.fileloader.listener.FileRequestListener
import com.path_studio.adil.databinding.ActivityPdfViewBinding


class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding
    private lateinit var functions: FirebaseFunctions

    companion object{
        val EXTRA_LEGISLATION_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[PdfViewerViewModel::class.java]
        functions = FirebaseFunctions.getInstance("asia-southeast2")

        val extras = intent.extras
        if(extras != null) {

            val docLegisId = extras.getString(EXTRA_LEGISLATION_ID) as String

            // Show Document pakai Firebase biasa
/*            viewModel.selectedLegislation(docLegisId)
            viewModel.getLegislationDoc().observe(this,{
                val legisPdf = it?.elementAt(0)
                showDocument(legisPdf)
            })
 */

            // show document pakai cloud function
            getSignedUrl(docLegisId).addOnCompleteListener{ task ->
                val url = task.result
                Log.i("url", url.toString())
                showDocument(url)
            }

        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }


    private fun getSignedUrl(docId: String): Task<String> {
        val data = hashMapOf(
            "filename" to "${docId}.0.pdf",
            "bucket" to "adil-pdf"
        )

        return functions
            .getHttpsCallable("getSignedUrl")
            .call(data)
            .continueWith { task ->
                Log.d("urldump", task.result?.data.toString())
                val result = task.result?.data as Map<*, *>
                result["url"].toString()
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