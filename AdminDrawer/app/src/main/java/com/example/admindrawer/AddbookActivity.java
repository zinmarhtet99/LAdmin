package com.example.admindrawer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.admindrawer.Adapter.UserAdapter;
import com.example.admindrawer.User.Book;

import java.util.ArrayList;
import java.util.List;

public class AddbookActivity extends AppCompatActivity {

   // TextView textView;
    List<Book> bookList;
    Book book;
    ListView listView;
    UserAdapter userAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.addbookview);
        recyclerView=findViewById(R.id.recyclerview);


        listView=findViewById(R.id.txtaddbook);

       // Intent intent=getIntent();
       // String name=intent.getStringExtra("keyName");
       // textView.setText((CharSequence) intent);
        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(AddbookActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);


        bookList=new ArrayList<>();

        book=new Book("001","Presents","Jue","Once", "IngyinMyaing Literature","It is interest book");
        bookList.add(book);
        userAdapter=new UserAdapter(getApplicationContext(),bookList);
        listView.setAdapter((ListAdapter) userAdapter);



    }
}
