package com.example.recyclerview_shintanuriyah_31

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgAnggota: Int,
    val namaAnggota: String,
    val descAnggota: String,
) : Parcelable
