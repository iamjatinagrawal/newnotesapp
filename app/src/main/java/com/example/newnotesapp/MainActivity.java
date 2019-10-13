package com.example.newnotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> notes = new ArrayList<>();
        notes.add("Hello World!");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,notes);

        listView.setAdapter(arrayAdapter);


    }
}
