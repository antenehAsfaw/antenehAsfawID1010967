package com.anteneh.user_management;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Information extends AppCompatActivity {

 RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        DatabaseOperations databaseOperations= new DatabaseOperations(getApplicationContext());

        recyclerView =findViewById(R.id.recyclerviewid);

           recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        List userList = new ArrayList();

        userList= databaseOperations.getAllUsers();
        ModelAdapter modelAdapter = new ModelAdapter(userList,getApplicationContext());
        recyclerView.setAdapter(modelAdapter);


    }

}