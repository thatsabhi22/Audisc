package com.theleafapps.pro.audisc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.theleafapps.pro.audisc.R
import com.theleafapps.pro.audisc.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Audisc)
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}