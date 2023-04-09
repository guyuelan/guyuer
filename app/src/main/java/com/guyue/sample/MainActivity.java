package com.guyue.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAnimation = findViewById(R.id.btn_animitor);
        mBtnAnimation.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnAnimation) {
            startActivity(new Intent(this, AnimationActivity.class));
        }

    }
}