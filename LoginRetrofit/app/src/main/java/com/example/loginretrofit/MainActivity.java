package com.example.loginretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginretrofit.Model.RegisterData;
import com.example.loginretrofit.api.ApiInterface;
import com.example.loginretrofit.api.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    Button buttonRegister;
    EditText userName,Password,userEmail,passwordconfirm;
    TextView tresponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.name);
        Password=findViewById(R.id.password);
        userEmail=findViewById(R.id.email);
        passwordconfirm=findViewById(R.id.confirmpassword);
        buttonRegister=findViewById(R.id.register);
        tresponse=findViewById(R.id.response);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

    }
    public void register(){
        String name=userName.getText().toString().trim();
        String email=userEmail.getText().toString().trim();
        String password=Password.getText().toString().trim();
        String passwordConfirm=passwordconfirm.getText().toString().trim();

        apiInterface= ApiUtils.getApi();
        Call<RegisterData> call= apiInterface.registerUser(name,email,password,passwordConfirm);


        call.enqueue(new Callback<RegisterData>() {
            @Override
            public void onResponse(Call<RegisterData> call, Response<RegisterData> response) {
                if(response.isSuccessful()){
                    RegisterData registerData=response.body();
                    tresponse.setText(registerData.getMessage());
                }
            }

            @Override
            public void onFailure(Call<RegisterData> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
