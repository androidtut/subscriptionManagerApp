package com.example.subscriptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.subscriptionapp.adapters.TopcardAdapters;
import com.example.subscriptionapp.adapters.bottomcardAdapters;
import com.example.subscriptionapp.models.carddatatop;

import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.*;

public class DetailsActivity extends AppCompatActivity {
ArrayList<carddatatop>carddata;
bottomcardAdapters adapters;
RecyclerView cardrecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        cardrecycler = findViewById(R.id.uniquebottomdata);

        carddata = new ArrayList<>();
        carddata.add(new carddatatop(R.drawable.dropbox,"DropBox","$8.00",""));
        carddata.add(new carddatatop(R.drawable.shazam,"Shazam","$7.00","recent"));
        carddata.add(new carddatatop(R.drawable.dropbox,"DropBox","$8.00",""));

        adapters = new bottomcardAdapters(carddata,this);
        cardrecycler.setAdapter(adapters);
        cardrecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

    }
}