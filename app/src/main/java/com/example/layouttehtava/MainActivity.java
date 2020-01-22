package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3;
ImageView img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        img1 = findViewById(R.id.img1);
    }

    public void btn1Click(View v){
        if (btn2.isEnabled()) {
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
        else if (!btn2.isEnabled()) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        }

    }

    public void btn2Click(View v){
      img1.setVisibility(View.GONE);
    }

    public void btn3Click(View v){
        img1.setVisibility(View.VISIBLE);

    }
}
