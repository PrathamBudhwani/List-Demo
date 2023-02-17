package com.prathambudhwani.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button listbtn,spinnerbtn,autobtn,recyclebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listbtn=findViewById(R.id.listbtn);
        spinnerbtn=findViewById(R.id.spinnerbtn);
        autobtn=findViewById(R.id.autobtn);
        recyclebtn=findViewById(R.id.recylebtn);




        Intent list=new Intent(MainActivity.this,List.class);
        Intent auto=new Intent(MainActivity.this,Auto2.class);
        Intent spinner=new Intent(MainActivity.this,Spinner2.class);
        Intent recycle=new Intent(MainActivity.this,Recycler.class);
        listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(list);
            }
        });
        spinnerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(spinner);
            }
        });
        autobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(auto);
            }
        });
        recyclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(recycle);
            }
        });



    }
}