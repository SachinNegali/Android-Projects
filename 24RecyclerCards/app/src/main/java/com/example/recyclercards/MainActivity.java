package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<ExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exampleList = new ArrayList<>();

        generateFakeData();
        customiseRecyclerView();

    }

    public void generateFakeData(){
        exampleList.add(new ExampleItem(R.drawable.code, "Code that's all you can do"));
        exampleList.add(new ExampleItem(R.drawable.oner, "Statue of liberty"));
        exampleList.add(new ExampleItem(R.drawable.twor, "Minions got you covered"));
        exampleList.add(new ExampleItem(R.drawable.threer, "Minions got you covered"));
        exampleList.add(new ExampleItem(R.drawable.fourr, "Minions got you covered"));
        exampleList.add(new ExampleItem(R.drawable.fiver, "Minions got you covered"));
        exampleList.add(new ExampleItem(R.drawable.sixr, "ML-learn to make machines learn"));
    }
    public void customiseRecyclerView(){
        recyclerView = findViewById(R.id.recyclerView);

        //for performance
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
