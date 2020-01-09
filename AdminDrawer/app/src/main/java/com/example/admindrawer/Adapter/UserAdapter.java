package com.example.admindrawer.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.admindrawer.AddbookActivity;
import com.example.admindrawer.MainActivity;
import com.example.admindrawer.R;
import com.example.admindrawer.User.Book;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<Book> bookList;
    Context context;

    public UserAdapter(Context context,List<Book> bookList) {
        this.bookList = bookList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerveiw,parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final UserViewHolder holder, final int position) {
        holder.addbook.setText(bookList.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        Button addbook,viewbook;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            addbook=itemView.findViewById(R.id.addbook);
            viewbook=itemView.findViewById(R.id.viewbook);





        }
    }
}
