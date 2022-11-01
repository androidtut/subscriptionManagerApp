package com.example.subscriptionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.subscriptionapp.adapters.TopcardAdapters;
import com.example.subscriptionapp.adapters.bottomcardAdapters;
import com.example.subscriptionapp.models.carddatatop;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class DashboardActivity extends AppCompatActivity {
    ArrayList<carddatatop>cardlist;
    RecyclerView topcardrecycler,bottomcard;
    TopcardAdapters Tadapters;
    bottomcardAdapters badapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        topcardrecycler = findViewById(R.id.topcardrecyclerview);
        bottomcard = findViewById(R.id.bottomdata);

        cardlist = new ArrayList<>();
        cardlist.add(new carddatatop(R.drawable.dropbox,"DropBox","$8.00",""));
        cardlist.add(new carddatatop(R.drawable.shazam,"Shazam","$7.00","recent"));
        cardlist.add(new carddatatop(R.drawable.dropbox,"DropBox","$8.00",""));

        Tadapters = new TopcardAdapters(cardlist,this);
        badapter = new bottomcardAdapters(cardlist,this);
        topcardrecycler.setAdapter(Tadapters);
        bottomcard.setAdapter(badapter);

        topcardrecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        bottomcard.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

    }
}