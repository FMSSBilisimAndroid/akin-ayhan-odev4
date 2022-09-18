package com.akinayhan.week4homework.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
data class MarsModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("img_src")
    val imgSrc: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("type")
    val type: String
):Parcelable
