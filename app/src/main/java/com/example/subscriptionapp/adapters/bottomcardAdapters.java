package com.example.subscriptionapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subscriptionapp.R;
import com.example.subscriptionapp.models.carddatatop;

import java.util.ArrayList;

public class bottomcardAdapters extends RecyclerView.Adapter<bottomcardAdapters.BottomViewholder>{
    ArrayList<carddatatop> carditems;
    Context context;

    public bottomcardAdapters(ArrayList<carddatatop> carditems, Context context) {
        this.carditems = carditems;
        this.context = context;
    }

    @NonNull
    @Override
    public BottomViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bottom_layout,parent,false);
        return new BottomViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomViewholder holder, int position) {
        final carddatatop cards = carditems.get(position);
        holder.topimage.setImageResource(cards.getImage());
        holder.title.setText(cards.getTitle());
        holder.price.setText(cards.getPrice());
    }

    @Override
    public int getItemCount() {
        return carditems.size();
    }

    public class BottomViewholder extends RecyclerView.ViewHolder{
        ImageView topimage;
        TextView title,price;
        public BottomViewholder(@NonNull View itemView) {
            super(itemView);
            topimage = itemView.findViewById(R.id.bottomcardimage);
            title = itemView.findViewById(R.id.bottomcardtitle);
            price = itemView.findViewById(R.id.bottomprice);
        }
    }
}
