package com.theleafapps.pro.audisc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.theleafapps.pro.audisc.R
import com.theleafapps.pro.audisc.databinding.ActivityFavoriteBinding
import com.theleafapps.pro.audisc.databinding.ActivityPlayerBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Audisc)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_favorite)
    }
}