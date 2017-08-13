package com.inuappcenter.univcam_android.views.AlbumDetailViews

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.inuappcenter.univcam_android.R
import com.inuappcenter.univcam_android.entites.Picture
import com.inuappcenter.univcam_android.fragments.AlbumDetailFragment
import java.io.File
import java.util.*

/**
 * Created by ichaeeun on 2017. 8. 13..
 */

class AlbumDetailPictureAdapter(var fragment: AlbumDetailFragment, var albumList: ArrayList<Picture>) : RecyclerView.Adapter<AlbumDetailPictureViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumDetailPictureViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumDetailPictureViewHolder(layoutInflater.inflate(R.layout.album_detail_picture_item, parent, false),fragment)
    }




    override fun onBindViewHolder(holder: AlbumDetailPictureViewHolder, position: Int) {
        val item = albumList[position]
        Glide.with(fragment.activity)
                .load(File(item.picturePath))
                .into(holder.picture)

    }
    override fun getItemCount(): Int {
        return albumList.size
    }




}

