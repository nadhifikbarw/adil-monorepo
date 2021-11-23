package com.path_studio.adil.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.path_studio.adil.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //disable dark mode - just need once
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        Handler(mainLooper).postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}