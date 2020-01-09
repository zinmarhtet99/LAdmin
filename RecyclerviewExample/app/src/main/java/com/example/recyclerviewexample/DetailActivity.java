package com.example.recyclerviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        textView=findViewById(R.id.name);

        Intent intent=getIntent();
        String name=intent.getStringExtra("keyName");
        textView.setText(name);

    }
}
