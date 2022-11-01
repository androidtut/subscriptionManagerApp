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


public class TopcardAdapters extends RecyclerView.Adapter<TopcardAdapters.Viewholder>{
    ArrayList<carddatatop>carditems;
    Context context;

    public TopcardAdapters(ArrayList<carddatatop> carditems, Context context) {
        this.carditems = carditems;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_card,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
       final carddatatop cards = carditems.get(position);
       holder.topimage.setImageResource(cards.getImage());
       holder.title.setText(cards.getTitle());
       holder.price.setText(cards.getPrice());
    }

    @Override
    public int getItemCount() {
        return carditems.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
   ImageView topimage;
   TextView title,price;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            topimage = itemView.findViewById(R.id.topcardimage);
            title = itemView.findViewById(R.id.topcardtitle);
            price = itemView.findViewById(R.id.topprice);
        }
    }
}
