package com.path_studio.adil.ui.pdfView

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.firebase.firestore.FirebaseFirestore
import com.krishna.fileloader.FileLoader
import com.krishna.fileloader.listener.FileRequestListener
import com.krishna.fileloader.pojo.FileResponse
import com.krishna.fileloader.request.FileLoadRequest
import com.path_studio.adil.databinding.ActivityPdfViewBinding
import java.io.File


class PdfViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPdfViewBinding

    companion object{
        val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = FirebaseFirestore.getInstance()

        val extras = intent.extras
        if(extras != null) {
            val docId =extras.getString(EXTRA_ID)

            val docRef = db.collection("legislation").document(docId.toString())
            docRef.get()
                .addOnSuccessListener { document ->
                    if(document != null){

                        //get data as array & choose the first
                        val group = document["document"] as List<String>?
                        val firstPdf = group?.elementAt(0)

                        FileLoader.with(this)
                            .load(firstPdf,false)
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
                    }else{
                        //Array "document" di Firestore kosong
                    }
                }.addOnFailureListener {
                    //nothing for now
                }

        }

        //set back button listener
        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}