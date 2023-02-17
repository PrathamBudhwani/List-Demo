package com.prathambudhwani.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class List extends AppCompatActivity {
    ArrayList<String> arrNames= new ArrayList<>();
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listview=findViewById(R.id.listview);

        String[] values = this.getResources().getStringArray(R.array.contacts);
        arrNames.addAll(Arrays.asList(values));

        ArrayAdapter<String> contacts = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrNames);
        listview.setAdapter(contacts);
    }
}