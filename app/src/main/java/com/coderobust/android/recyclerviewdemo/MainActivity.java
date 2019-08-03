package com.coderobust.android.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Toy> toysList;
    RecyclerView toysRecyclerView;
    ToysRecyclerViewAdapter toysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toysList=new ArrayList<>();
        toysList.add(new Toy(R.drawable.toy1,"Taddy bear",250));
        toysList.add(new Toy(R.drawable.toy2,"Toys Package",251));
        toysList.add(new Toy(R.drawable.toy3,"All toys",252));
        toysList.add(new Toy(R.drawable.toy4,"Warriers",253));
        toysList.add(new Toy(R.drawable.toy5,"Panda",254));
        toysList.add(new Toy(R.drawable.toy6,"Barbie doll",255));
        toysList.add(new Toy(R.drawable.toy7,"Snow white",256));
        toysList.add(new Toy(R.drawable.toy8,"Kaneki",257));

        toysRecyclerView=findViewById(R.id.toys_recyclerview);
        toysRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        toysAdapter=new ToysRecyclerViewAdapter(this,toysList);
        toysRecyclerView.setAdapter(toysAdapter);

    }
}
