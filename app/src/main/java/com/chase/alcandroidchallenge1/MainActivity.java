package com.chase.alcandroidchallenge1;

import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ALC 4 Phase 1");

        Button btnAbout = findViewById(R.id.btnAbout);
        Button btnProfile = findViewById(R.id.btnProfile);

        btnAbout.setOnClickListener(view -> {
            NavigationUtils.navigateToAbout(this);
        });

        btnProfile.setOnClickListener(view -> {
            NavigationUtils.navigateToProfile(this);
        });

    }
}
