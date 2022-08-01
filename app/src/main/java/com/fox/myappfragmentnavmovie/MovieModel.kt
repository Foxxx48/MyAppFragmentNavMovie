package com.fox.myappfragmentnavmovie

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieModel(

    val category: String,
    val desc: String,
    val imageUrl: String,
    val name: String

): Parcelable
