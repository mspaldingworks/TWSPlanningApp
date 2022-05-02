package com.mad.e.twsplanningapp.model

import com.mad.e.twsplanningapp.R
import java.io.Serializable

data class Session(
    val id: Int,
    val title: String,
    val presenter: String,
    val time: Int,
    val bitmap: Int,
    val favorite: Boolean,
) : Serializable {


    companion object {
        fun getMockSession(): Session {
            val session = Session(
                1,
                "No Human Business!",
                "Dr. Zaius",
                1200,
                R.drawable.dr__zaius,
                favorite = false,
            )
            return session
        }
    }
}