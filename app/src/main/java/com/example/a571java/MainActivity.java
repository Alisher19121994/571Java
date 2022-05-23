package com.example.a571java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.main_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getAdapter(data());
    }

    private void getAdapter(ArrayList<Contents> list) {
        Adapter_1 adapter_1 = new Adapter_1(context, list);
        recyclerView.setAdapter(adapter_1);
    }

    private ArrayList<Contents> data() {
        ArrayList<Contents> contents = new ArrayList<>();

        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));

        return contents;
    }
}