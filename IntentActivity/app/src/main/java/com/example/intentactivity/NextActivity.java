package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textName=findViewById(R.id.txtname);

        Intent intent=getIntent();
        String name=intent.getStringExtra("keyName");
        textName.setText(name);

    }
}
