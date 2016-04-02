package com.example.slf.pulse_manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment1 extends Fragment {
    private ArrayList<Shop> shopList;
    private ListView listView;
    private ShopListAdapter adapter;
    private Context context;
    private Activity activity;
    private View view;

    public MyFragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, container, false);
        context=getActivity();
        activity=getActivity();
        shopList=new ArrayList<Shop>();
        listView= (ListView) view.findViewById(R.id.listview_shop);
        initList();
        adapter=new ShopListAdapter(activity,R.layout.sell_item,shopList);
        Log.d("test","1");
        listView.setAdapter(adapter);
        Log.d("test", "2");
        //Log.d("test", "exapmple" + example);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id1) {
                Log.d("test","adadada");
                Intent intent=new Intent(context,ShopDetailActivity.class);
                startActivity(intent);

            }
        });
        return view;
    }

    private void initList() {
        for (int i=0;i<=5;i++){
            Shop shop=new Shop("平嘉大药房","1.2千米",R.drawable.shop2,R.drawable.stars);
            shopList.add(shop);
        }

    }
}
