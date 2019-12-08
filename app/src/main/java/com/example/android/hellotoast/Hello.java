package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    //String mess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        textView1=findViewById(R.id.tv1);
        textView2=findViewById(R.id.tv2);
        Intent intent = getIntent();
        String message = intent.getStringExtra("count");
        textView2.setText(message);
    }
}
