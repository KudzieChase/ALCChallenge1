package com.chase.alcandroidchallenge1;

import android.content.Context;
import android.content.Intent;

public class NavigationUtils {

    public static void navigateToProfile(Context context) {
        Intent intent = new Intent(context, ProfileActivity.class);
        context.startActivity(intent);
    }

    public static void navigateToAbout(Context context) {
        Intent intent = new Intent(context, AboutActivity.class);
        context.startActivity(intent);
    }
}
