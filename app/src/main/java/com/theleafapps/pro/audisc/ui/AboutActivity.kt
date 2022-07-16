package com.theleafapps.pro.audisc.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.theleafapps.pro.audisc.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity(){

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return ""
    }
}