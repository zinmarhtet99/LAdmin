package com.example.admin.Model;



import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.example.admin.R;
import com.example.admin.Utils.FontEmbedder;

import java.util.List;

import static android.provider.Settings.System.getString;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.UserViewHolder> {


    List<Book1> bookList;
    Context context;


    public BookAdapter(Context context, List<Book1> bookList) {
        this.bookList = bookList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_book,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        FontEmbedder.force(holder.txttitle,bookList.get(position).getTitle().toString());
        FontEmbedder.force(holder.txtauthor,bookList.get(position).getAuthor().getName().toString());

        Glide.with(context)
                .load("https://culibrary1.000webhostapp.com/"+bookList.get(position).getImage())
                .into(holder.imageView);

    }



    @Override
    public int getItemCount() {
        return bookList.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder {

        TextView txttitle,txtauthor;
        ImageView imageView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            txttitle = itemView.findViewById(R.id.title);
            txtauthor=itemView.findViewById(R.id.author);
            imageView = itemView.findViewById(R.id.img);
        }


    }
}

