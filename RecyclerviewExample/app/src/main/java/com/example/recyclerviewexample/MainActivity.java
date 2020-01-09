package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexample.Adapter.UserAdapter;
import com.example.recyclerviewexample.User.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> userList;
    RecyclerView recyclerView;
    CardView cardView;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      recyclerView=findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
   recyclerView.setLayoutManager(linearLayoutManager);

        userList =new ArrayList<>();
        user=new User("Min Thway Khant","Yangon","09427909876","minthwaykhant26@gamil.com");
        userList.add(user);

        user=new User("M Zaw Rain","Yangon","09653214569","mzr26@gamil.com");
        userList.add(user);



        UserAdapter userAdapter=new UserAdapter(MainActivity.this,userList);
       recyclerView.setAdapter(userAdapter);



    }
}
