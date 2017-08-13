package com.inuappcenter.univcam_android.views.AlbumViews

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.inuappcenter.univcam_android.R
import com.inuappcenter.univcam_android.entites.Album
import com.inuappcenter.univcam_android.fragments.AlbumSelectFragment
import java.util.*


/**
 * Created by ichaeeun on 2017. 7. 29..
 */

class AlbumViewSelectAdapter(var context: AlbumSelectFragment, var albumList: ArrayList<Album>) : RecyclerView.Adapter<AlbumSelectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumSelectViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumSelectViewHolder(layoutInflater.inflate(R.layout.album_select_item, parent, false), context)
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    override fun onBindViewHolder(holder: AlbumSelectViewHolder, position: Int) {
        val item = albumList[position]
        holder.thumbnail.setImageResource(R.drawable.img_example)
        holder.tv_title.setText(item.albumName)
        holder.tv_quantity.setText("${item.quantity}장의 사진")


    }




}


