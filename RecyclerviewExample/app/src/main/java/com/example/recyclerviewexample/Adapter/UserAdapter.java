package com.example.recyclerviewexample.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.DetailActivity;
import com.example.recyclerviewexample.MainActivity;
import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.User.User;

import java.util.List;

import static com.example.recyclerviewexample.R.id.recyclerview;
import static com.example.recyclerviewexample.R.layout.recycler_view;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    List<User> userList;
    Context context;

    public UserAdapter(Context context, List<User> userList) {
        this.userList = userList;
        this.context=context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View userView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);

        return new UserViewHolder(userView);
    }

    @Override
    public void onBindViewHolder(@NonNull final UserViewHolder holder, int position) {
        holder.txt_name.setText(userList.get(position).getName());
        holder.txt_addr.setText(userList.get(position).getAddr());
        holder.txt_phno.setText(userList.get(position).getPhno());
        holder.txt_email.setText(userList.get(position).getEmail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailActivity.class);
                intent.putExtra("keyName",userList.get(holder.getAdapterPosition()).getName());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {

        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        TextView txt_name,txt_addr,txt_phno,txt_email;
        CardView cardView;

        public  UserViewHolder(View itemView){
            super(itemView);
            txt_name=itemView.findViewById(R.id.txt_name);
            txt_addr=itemView.findViewById(R.id.txt_addr);
           txt_phno=itemView.findViewById(R.id.txt_phno);
         txt_email=itemView.findViewById(R.id.txt_email);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}
