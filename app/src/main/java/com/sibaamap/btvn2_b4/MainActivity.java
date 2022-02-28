package com.sibaamap.btvn2_b4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rvc_user);


        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);


    }



    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.pdfimg1,"To Kill a Mockingbird"));
        list.add(new User(R.drawable.pdfimg1,"To Kill a Mockingbird"));
        list.add(new User(R.drawable.pdfimg1,"To Kill a Mockingbird"));
        list.add(new User(R.drawable.pdfimg1,"To Kill a Mockingbird"));
        list.add(new User(R.drawable.pdfimg1,"To Kill a Mockingbird"));
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }




}