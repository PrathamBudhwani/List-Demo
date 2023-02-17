package com.prathambudhwani.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {
    RecyclerView recycle;
    ArrayList<ContactModel> arrContacts=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recycle=findViewById(R.id.recyclercontact);

        recycle.setLayoutManager(new LinearLayoutManager(this));


        arrContacts.add(new ContactModel(R.drawable.d,"A","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"B","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"C","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"D","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"E","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"F","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"G","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"H","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"I","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"J","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"K","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"L","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"M","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"N","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"O","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"P","7905510376"));
        arrContacts.add(new ContactModel(R.drawable.d,"AQ","7905510376"));

        RecycleContactAdapter adapter3=new RecycleContactAdapter(this,arrContacts);
        recycle.setAdapter(adapter3);


    }
}