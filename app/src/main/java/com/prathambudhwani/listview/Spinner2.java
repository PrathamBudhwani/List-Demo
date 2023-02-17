package com.prathambudhwani.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner2 extends AppCompatActivity {
    TextView text;
    Spinner spin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);

        text=findViewById(R.id.text);
        spin=findViewById(R.id.spin);


    }
}