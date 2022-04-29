package com.mad.e.twsplanningapp.model

import java.io.Serializable

data class Session(
    val id: Int,
    val title: String,
    val presenter: String,
    val time: Int,
    val bitmap: Int,
    val favorite: Boolean,
) : Serializable {}