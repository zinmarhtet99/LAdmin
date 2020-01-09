package com.example.sumsubmuldivexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsum,btnsub,btnmul,btndiv;
    EditText edtone,edttwo;

    TextView txtresult;
    String edt1,edt2;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsum=findViewById(R.id.btnsum);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);

        edtone=findViewById(R.id.txtone);
        edttwo=findViewById(R.id.txttwo);
        txtresult=findViewById(R.id.txtresult);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               edt1 =edtone.getText().toString();
               edt2 =edttwo.getText().toString();


                num1=Integer.parseInt(edt1);
                num2=Integer.parseInt(edt2);

                txtresult.setText(Integer.toString(num1+num2));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                edt1 =edtone.getText().toString();
                edt2 =edttwo.getText().toString();


                num1=Integer.parseInt(edt1);
                num2=Integer.parseInt(edt2);

                txtresult.setText(Integer.toString(num1-num2));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                edt1 =edtone.getText().toString();
                edt2 =edttwo.getText().toString();


                num1=Integer.parseInt(edt1);
                num2=Integer.parseInt(edt2);

                txtresult.setText(Integer.toString(num1*num2));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                edt1 =edtone.getText().toString();
                edt2 =edttwo.getText().toString();


                num1=Integer.parseInt(edt1);
                num2=Integer.parseInt(edt2);

                txtresult.setText(Integer.toString(num1/num2));
            }
        });








    }
}
