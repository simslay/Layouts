package com.example.layouts.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.layouts.R;

public class A02_SimpsonActivity extends AppCompatActivity {
    ImageView ivSimpson;

    public void initUI() {
        ivSimpson = findViewById(R.id.iv_simpson);
    }

    private void setIvSimpson() {
        ivSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_simpson);

        initUI();
        setIvSimpson();
    }
}