package com.example.slf.pulse_manager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.slf.pulse_manager.R;
import com.example.slf.pulse_manager.object.Shop;

import java.util.List;

/**
 * Created by slf on 16/4/1.
 */
public class ShopListAdapter extends ArrayAdapter<Shop> {
    private Context context;
    private int resource_id;
    public ShopListAdapter(Context context, int resource,List<Shop> objects) {
        super(context, resource,objects);
        this.context=context;
        this.resource_id=resource;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        Shop shop=getItem(position);
        View view;
        ViewHolder viewHolder=new ViewHolder();
        view= LayoutInflater.from(getContext()).inflate(resource_id,null);
        viewHolder.shop=(ImageView)view.findViewById(R.id.image_shop);
        viewHolder.star=(ImageView)view.findViewById(R.id.image_star);
        viewHolder.name= (TextView) view.findViewById(R.id.text_name);
        viewHolder.diatance= (TextView) view.findViewById(R.id.text_distance);
        viewHolder.shop.setImageResource(shop.getImage_shop());
        viewHolder.star.setImageResource(shop.getImage_star());
        viewHolder.name.setText(shop.getName());
        viewHolder.diatance.setText(shop.getDistance());

        return view;
    }

    class ViewHolder{
        ImageView shop,star;
        TextView name,diatance;
    }

}
