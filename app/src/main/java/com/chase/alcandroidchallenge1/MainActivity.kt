package com.chase.alcandroidchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.title = "ALC 4 Phase 1"

        btnAbout.setOnClickListener {
            NavigationUtils.navigateToAboutActivity(this)
        }

        btnProfile.setOnClickListener {
            NavigationUtils.navigateToProfileActivity(this)
        }
    }
}
