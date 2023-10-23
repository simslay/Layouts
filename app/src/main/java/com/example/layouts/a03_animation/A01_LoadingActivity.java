package com.example.layouts.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.layouts.R;

public class A01_LoadingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_loading);

        ImageView ivLoading = findViewById(R.id.iv_loading);

        ivLoading.animate().alpha(1).setDuration(2000).rotation(3600);
    }
}