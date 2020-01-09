package com.example.retrofitproject.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.retrofitproject.R;
import com.example.retrofitproject.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.user_name.setText(userList.get(position).getName());
        holder.username.setText(userList.get(position).getUsername());
        holder.email.setText(userList.get(position).getEmail());
        holder.phno.setText(userList.get(position).getPhone());
        holder.website.setText(userList.get(position).getWebsite());
        holder.username.setText(userList.get(position).getAddress().getGeo().getLat());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView user_name,username,email,phno,website;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            user_name=itemView.findViewById(R.id.txtview);
            username=itemView.findViewById(R.id.username);
            email=itemView.findViewById(R.id.email);
            phno=itemView.findViewById(R.id.phone);
            website=itemView.findViewById(R.id.website);
        }
    }
}
