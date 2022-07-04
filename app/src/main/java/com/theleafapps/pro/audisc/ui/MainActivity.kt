package com.theleafapps.pro.audisc.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.theleafapps.pro.audisc.R
import com.theleafapps.pro.audisc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shuffleBtn.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button clicked",Toast.LENGTH_SHORT).show()
        }
    }
}