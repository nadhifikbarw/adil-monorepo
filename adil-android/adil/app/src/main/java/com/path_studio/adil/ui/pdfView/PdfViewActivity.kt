package com.path_studio.adil.ui.pdfView

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.FirebaseFunctionsException
import com.google.firebase.functions.ktx.functions
import com.google.firebase.ktx.Firebase
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
        functions = Firebase.functions

        val extras = intent.extras
        if(extras != null) {

            val docLegisId =extras.getString(EXTRA_LEGISLATION_ID) as String

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
                // This continuation runs on either success or failure, but if the task
                // has failed then result will throw an Exception which will be
                // propagated down.
                val result = task.result?.data as Map<String,Any>
                result["url"] as String
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