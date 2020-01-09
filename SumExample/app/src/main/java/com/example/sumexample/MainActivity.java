package com.example.sumexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_one;
    EditText edt_two;
    String txtone,txttwo;
    int edtone,edttwo;
    TextView txtview;
    Button btnsum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsum=findViewById(R.id.sum);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt_one=findViewById(R.id.edt_one);
                edt_two=findViewById(R.id.edt_two);
                txtview=findViewById(R.id.txt);

                txtone=edt_one.getText().toString();
                txttwo=edt_two.getText().toString();

                edtone=Integer.parseInt(txtone);
                edttwo=Integer.parseInt(txttwo);

                txtview.setText(Integer.toString(edtone+edttwo));
            }
        });

        
    }
}
