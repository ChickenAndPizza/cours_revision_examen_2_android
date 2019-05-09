package com.example.a533.revision_examen_2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    List<JobOfferModel> jobList = new ArrayList<>();

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView_job);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        JobOfferModel toDo = new JobOfferModel("Charpentier", "Trier du bois", 20.25);
        jobList.add(toDo);
        toDo = new JobOfferModel("Programmeur", "Écrire du code", 20.25);
        jobList.add(toDo);
        toDo = new JobOfferModel("Cuisinier", "Manger", 20.25);
        jobList.add(toDo);

        adapter = new JobRecyclerAdapter(jobList);
        recyclerView.setAdapter(adapter);

        SetListeners();
    }

    private void SetListeners(){

    }

}
