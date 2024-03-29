package com.path_studio.adil.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.di.Injection
import com.path_studio.adil.ui.categoryResult.CategoryResultViewModel
import com.path_studio.adil.ui.detailUU.information.InformationViewModel
import com.path_studio.adil.ui.detailUU.timeline.TimelineViewModel
import com.path_studio.adil.ui.main.bookmark.BookmarkViewModel
import com.path_studio.adil.ui.main.category.CategoryViewModel
import com.path_studio.adil.ui.main.home.HomeViewModel
import com.path_studio.adil.ui.pdfView.PdfViewerViewModel
import com.path_studio.adil.ui.searchResult.SearchResultViewModel

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
            modelClass.isAssignableFrom(CategoryResultViewModel::class.java) -> {
                CategoryResultViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(BookmarkViewModel::class.java) -> {
                BookmarkViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(InformationViewModel::class.java) -> {
                InformationViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(SearchResultViewModel::class.java) -> {
                SearchResultViewModel(mAdilRepository) as T
            }
            modelClass.isAssignableFrom(TimelineViewModel::class.java) -> {
                TimelineViewModel(mAdilRepository) as T
            }
            
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}