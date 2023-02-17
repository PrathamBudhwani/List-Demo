package com.prathambudhwani.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Auto2 extends AppCompatActivity {
    AutoCompleteTextView completeTextView;
    ArrayList<String> arrCon=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto2);
        completeTextView=findViewById(R.id.complete);

        String[] values2 = this.getResources().getStringArray(R.array.langauages);
        arrCon.addAll(Arrays.asList(values2));
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrCon);
        completeTextView.setAdapter(adapter2);
        completeTextView.setThreshold(2);


    }
}