package com.example.retrofitproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofitproject.Adapter.UserAdapter;
import com.example.retrofitproject.Model.Users;
import com.example.retrofitproject.api.ApiInterface;
import com.example.retrofitproject.api.ApiUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    UserAdapter userAdapter;
    RecyclerView recyclerView;
    ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface= ApiUtils.getApi();

        Call<List<Users>> getUsers=apiInterface.getAllUsers();

        getUsers.enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                LoadUserList(response.body());
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
    public void LoadUserList(List<Users> userList){
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        userAdapter=new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);
    }
}
