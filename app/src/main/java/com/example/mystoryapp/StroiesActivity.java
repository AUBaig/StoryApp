package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StroiesActivity extends AppCompatActivity {
    TextView textView;
    TextView textview2;
    ImageView imageView;

    Spics[] img=new Spics[]{
            new Spics(R.drawable.guardians)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroies);
        setContentView(R.layout.activity_stroies);

        textView = findViewById(R.id.text);
        textview2 = findViewById(R.id.text1);
        imageView = findViewById(R.id.simage1);

        String str = getIntent().getStringExtra("title");
        String str1 = getIntent().getStringExtra("fS");

        textView.setText(str);
        textview2.setText(str1);
        imageView.setImageResource(img[0].getImages());

    }
}