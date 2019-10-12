package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycler.Adapters.Adapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    Adapter.VH adapter;
    int a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv = findViewById(R.id.rcv);

        
        //rcv.hasFixedSize(true);
    }


}
