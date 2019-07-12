package com.chase.alcandroidchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        this.title = "My Profile"

        this.actionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load("https://avatars3.githubusercontent.com/u/16834730?s=460&v=4")
            .circleCrop()
            .into(profileImageView)
    }
}
