package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.layouts.a01_layout.L01_LinearActivity;
import com.example.layouts.a01_layout.L02_FrameActivity;
import com.example.layouts.a01_layout.L03_RelativeActivity;
import com.example.layouts.a03_animation.A01_LoadingActivity;
import com.example.layouts.a03_animation.A02_SimpsonActivity;

public class HomeActivity extends AppCompatActivity {
    /** Personal */
    // 1 variables globales
    Button btnLinearLayout;
    Button btnFrameLayout;
    Button btnRelativeLayout;
    Button btnAnimationLoading;
    Button btnAnimationSimpson;

    // 2 Methode d'initialisation des widgets
    public void initUI() {
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnAnimationLoading = findViewById(R.id.btn_animation_loading);
        btnAnimationSimpson = findViewById(R.id.btn_animation_simpson);
    }

    // 4 Methode pour la gestion du bouton LinearLayout
    private void setBtnLinearLayout() {
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
            }
        });
    }

    private void setBtnFrameLayout() {
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_FrameActivity.class));
            }
        });
    }

    private void setBtnRelativeLayout() {
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_RelativeActivity.class));
            }
        });
    }

    private void setBtnAnimationLoading() {
        btnAnimationLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, A01_LoadingActivity.class));
            }
        });
    }

    private void setBtnAnimationSimpson() {
        btnAnimationSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, A02_SimpsonActivity.class));
            }
        });
    }

    /** Life cycles */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3
        // 4
        setBtnLinearLayout();
        setBtnFrameLayout();
        setBtnRelativeLayout();
        setBtnAnimationLoading();
        setBtnAnimationSimpson();
        // commit push
    }
}