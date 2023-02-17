package com.prathambudhwani.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContactAdapter extends RecyclerView.Adapter<RecycleContactAdapter.RVViewAdapter> {
    Context context;
    ArrayList<ContactModel> arrContacts;

    RecycleContactAdapter(Context context, ArrayList<ContactModel> arrContacts) {
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public RVViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        return new RVViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewAdapter holder, int position) {

        holder.txtnumber.setText(arrContacts.get(position).number);
        holder.txtname.setText(arrContacts.get(position).name);
        holder.imagec.setImageResource(arrContacts.get(position).image);

    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }


    public class RVViewAdapter extends RecyclerView.ViewHolder {
        TextView txtname,txtnumber;
        ImageView imagec;
        public RVViewAdapter(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.contact);
            txtnumber=itemView.findViewById(R.id.number);
            imagec=itemView.findViewById(R.id.imagec);
        }
    }
}
