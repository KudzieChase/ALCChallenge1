package com.chase.alcandroidchallenge1;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setTitle("My Profile");

        ImageView profileImageView = findViewById(R.id.profileImageView);

        Glide.with(this)
                .load("https://avatars3.githubusercontent.com/u/16834730?s=460&v=4")
                .circleCrop()
                .into(profileImageView);

    }
}
