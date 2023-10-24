package com.example.layouts.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.layouts.R;

public class A02_SimpsonActivity extends AppCompatActivity {
    // Declaration des var
    ImageButton ibLesSimpson;
    ImageView ivBart;
    ImageView ivHomer;

    // On fait le lien entre la vue et le code
    public void init() {
        ibLesSimpson = findViewById(R.id.ib_les_simpson);
        ivBart = findViewById(R.id.iv_bart);
        ivHomer = findViewById(R.id.iv_homer);
    }

    public void anim(View view) {
        // On fait un fade pour faire apparaitre notre image et on la fait tourner en même temps
        ibLesSimpson.animate().alpha(0).rotation(3600).setDuration(2000);
        ivBart.animate().translationXBy(-3000).setDuration(4000);
        ivHomer.animate().translationXBy(-3000).setDuration(5000);
        // Appel du handler
        handler.postDelayed(runnable, 6000);
    }

    Handler handler = new Handler();

    public final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_simpson);

        init();
    }
}