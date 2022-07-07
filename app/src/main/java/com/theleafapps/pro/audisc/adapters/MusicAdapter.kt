package com.theleafapps.pro.audisc.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.theleafapps.pro.audisc.databinding.MusicViewBinding

class MusicAdapter(private val context: Context, val musicList:ArrayList<String>)
            : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(MusicViewBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.title.text = musicList[position]
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    class MusicViewHolder(binding:MusicViewBinding) : RecyclerView.ViewHolder(binding.root) {
        val title = binding.songNameMV
        val album = binding.songAlbumMV
        val image = binding.imageMV
        val duration = binding.songDuration
    }
}