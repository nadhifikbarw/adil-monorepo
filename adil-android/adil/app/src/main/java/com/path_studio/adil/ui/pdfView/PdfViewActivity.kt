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

            val docRef = db.collection("legislation").document("11e44c4e281ce9d0947a313231323039")
            docRef.get()
                .addOnSuccessListener { document ->
                    if(document != null){

                        //get data as array & choose the first
                        val group = document["document"] as List<String>?
                        val firstPdf = group?.elementAt(0)

                        FileLoader.with(this)
                            .load("https://storage.googleapis.com/adil-pdf/11e44c4e281ce9d0947a313231323039.0.pdf?X-Goog-Algorithm=GOOG4-RSA-SHA256&X-Goog-Credential=firebase-adminsdk-doiew%40adil-gcp.iam.gserviceaccount.com%2F20210521%2Fauto%2Fstorage%2Fgoog4_request&X-Goog-Date=20210521T202945Z&X-Goog-Expires=3601&X-Goog-SignedHeaders=host&X-Goog-Signature=27377b241adb16e45d827a376b8b499f08ff1021780e9c61ef790bd3c45e0f864a47c01586de77853b2ffbb209e124274a1b8ba30972d55564e66465fed276ca0285deef090719c25a1c6e9c1c1b70ca785da56740602dc268ae777cd915f29f68c9fdf5d6b4ee8c93f5114de19cfacb22d41d582137eee2cc5af3c19714d137fc2c470be6c7c8fee67047432b741bc9feb8c141800b734fc8443a646b2b550c4c31d10f197c528f81b946135155b161d51a1ec736696ca981ba83de3044a97d04cdd7159ec4c422f300c51b80c0dae3c2616e58b58d018f446bf106074592469fe46412b98275b901204072fb7b30bafbca52a18e8fd5120ae4f470023abdb3",false)
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