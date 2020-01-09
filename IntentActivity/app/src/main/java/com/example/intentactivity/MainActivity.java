package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNextActivity; //Cammel case letter
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextActivity=findViewById(R.id.btn_next);
        editText=findViewById(R.id.edit_name);



        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name=editText.getText().toString();
                Intent intent=new Intent(MainActivity.this,NextActivity.class);
                intent.putExtra("keyName",name);
                startActivity(intent);

            }
        });
    }
}
