package com.techychirag.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Intent intent=getIntent();
        String Username=intent.getStringExtra(MainActivity.Message);

        TextView textView=findViewById(R.id.txtWelcome);
        textView.setText("Welcome "+Username);
    }
}