package com.example.slf.pulse_manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by slf on 16/4/1.
 */
public class MedicineListAdapter extends ArrayAdapter<Medicine> {
    private Context context;
    private int resource_id;
    public MedicineListAdapter(Context context, int resource,List<Medicine> objects) {
        super(context, resource,objects);
        this.context=context;
        this.resource_id=resource;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        Medicine medicine=getItem(position);
        View view;
        ViewHolder viewHolder=new ViewHolder();
        view= LayoutInflater.from(getContext()).inflate(resource_id,null);
        viewHolder.description= (TextView) view.findViewById(R.id.text_description);
        viewHolder.medicine=(ImageView)view.findViewById(R.id.image_medicine);
        viewHolder.star=(ImageView)view.findViewById(R.id.image_star);
        viewHolder.name= (TextView) view.findViewById(R.id.text_name);
        viewHolder.price= (TextView) view.findViewById(R.id.text_price);
        viewHolder.medicine.setImageResource(medicine.getImage_shop());
        viewHolder.star.setImageResource(medicine.getImage_star());
        viewHolder.name.setText(medicine.getName());
        viewHolder.price.setText(medicine.getPrice());
        viewHolder.description.setText(medicine.getDescription());

        return view;
    }

    class ViewHolder{
        ImageView medicine,star;
        TextView name,price,description;
    }

}
