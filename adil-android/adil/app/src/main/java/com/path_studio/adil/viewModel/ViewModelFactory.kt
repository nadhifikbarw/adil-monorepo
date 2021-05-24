package com.path_studio.adil.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.di.Injection
import com.path_studio.adil.ui.main.category.CategoryViewModel
import com.path_studio.adil.ui.main.home.HomeViewModel
import com.path_studio.adil.ui.pdfView.PdfViewerViewModel

class ViewModelFactory private constructor(private val mAdilRepository: AdilRepository) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                ViewModelFactory(Injection.provideImdbRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(CategoryViewModel::class.java) -> {
                CategoryViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(PdfViewerViewModel::class.java) -> {
                PdfViewerViewModel(mAdilRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}