package com.path_studio.adil

import android.app.Application
import com.path_studio.adil.data.database.AdilDatabase

class AdilApplication : Application() {
    val database by lazy { AdilDatabase.getDatabase(this) }
}