package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    RecyclerView rvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rvinfo = findViewById(R.id.recyclerView);
        rvinfo.setLayoutManager(new LinearLayoutManager(this));

        Adpater Adpater = new Adpater(getApplicationContext());
        rvinfo.setAdapter(Adpater);
    }
}
