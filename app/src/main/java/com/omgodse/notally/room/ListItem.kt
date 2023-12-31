package com.omgodse.notally.room

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListItem(var body: String, var checked: Boolean) : Parcelable