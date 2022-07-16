package com.theleafapps.pro.audisc.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.theleafapps.pro.audisc.R
import com.theleafapps.pro.audisc.adapters.FavoriteAdapter
import com.theleafapps.pro.audisc.data.Music
import com.theleafapps.pro.audisc.data.checkPlaylist
import com.theleafapps.pro.audisc.databinding.ActivityFavoriteBinding
import com.theleafapps.pro.audisc.databinding.ActivityPlayerBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding
    private lateinit var adapter: FavoriteAdapter

    companion object{
        var favouriteSongs: ArrayList<Music> = ArrayList()
        var favouritesChanged: Boolean = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        favouriteSongs = checkPlaylist(favouriteSongs)
        binding.backBtnFA.setOnClickListener { finish() }
        binding.favouriteRV.setHasFixedSize(true)
        binding.favouriteRV.setItemViewCacheSize(13)
        binding.favouriteRV.layoutManager = GridLayoutManager(this, 4)
        adapter = FavoriteAdapter(this, favouriteSongs)
        binding.favouriteRV.adapter = adapter

        favouritesChanged = false

        if(favouriteSongs.size < 1) binding.shuffleBtnFA.visibility = View.INVISIBLE

        if(favouriteSongs.isNotEmpty()) binding.instructionFV.visibility = View.GONE

        binding.shuffleBtnFA.setOnClickListener {
            val intent = Intent(this, PlayerActivity::class.java)
            intent.putExtra("index", 0)
            intent.putExtra("class", "FavoriteShuffle")
            startActivity(intent)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        if(favouritesChanged) {
            adapter.updateFavourites(favouriteSongs)
            favouritesChanged = false
        }
    }
}