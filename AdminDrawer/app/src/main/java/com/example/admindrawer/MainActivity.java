package com.example.admindrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admindrawer.Adapter.UserAdapter;
import com.example.admindrawer.User.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> bookList;
    RecyclerView recyclerView;
    Book book;
    Button addbook,viewbook;
//    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        addbook=findViewById(R.id.addbook);
        viewbook=findViewById(R.id.viewbook);





        viewbook.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       Intent intent=new Intent(MainActivity.this,AddbookActivity.class);
                      // intent.putExtra("keyName",bookList.toString());
                       startActivity(intent);




                   }
               });
//        LinearLayoutManager linearLayoutManager;
//        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//        bookList=new ArrayList<>();
//
//        book=new Book("001","Presents","Jue","Once", "IngyinMyaing Literature","It is interest book");
//        bookList.add(book);
//
//
//        UserAdapter userAdapter=new UserAdapter(MainActivity.this,bookList);
//        recyclerView.setAdapter(userAdapter);








    }
}
