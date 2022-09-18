package com.akinayhan.week4homework.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

fun ImageView.downloadFromUrl(image : String){
    image.let {
        Glide.with(context)
            .load(image)
            .into(this)
    }
}

@BindingAdapter("android:downloadImageUrl")
fun downloadImage(view: ImageView, image: String){
    view.downloadFromUrl(image)
}