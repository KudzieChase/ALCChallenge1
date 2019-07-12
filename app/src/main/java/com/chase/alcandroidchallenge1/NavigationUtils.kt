package com.chase.alcandroidchallenge1

import android.content.Context
import android.content.Intent

object NavigationUtils {

    fun navigateToProfileActivity(context: Context) {
        val intent = Intent(context, ProfileActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToAboutActivity(context: Context) {
        val intent = Intent(context, AboutActivity::class.java)
        context.startActivity(intent)
    }
}