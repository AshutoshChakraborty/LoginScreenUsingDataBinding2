package com.example.ashutosh.loginscreenusingdatabinding;

import android.view.View;
import android.widget.Toast;

public class ClickHandler {
    public void showJson(View view,User user) {
        Toast.makeText(view.getContext(), user.toString(), Toast.LENGTH_LONG).show();
    }
}
