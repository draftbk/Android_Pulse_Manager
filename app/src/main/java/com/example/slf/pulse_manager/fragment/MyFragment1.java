package com.example.slf.pulse_manager.fragment;

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

import com.example.slf.pulse_manager.R;
import com.example.slf.pulse_manager.object.Shop;
import com.example.slf.pulse_manager.activity.ShopDetailActivity;
import com.example.slf.pulse_manager.adapter.ShopListAdapter;

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
        for (int i=0;i<1;i++){
            Shop shop=new Shop("平嘉大药房","1.2千米",R.drawable.shop1,R.drawable.stars);
            shopList.add(shop);
            Shop shop2=new Shop("漱玉平民大药房","3.6千米",R.drawable.shop2,R.drawable.stars2);
            shopList.add(shop2);
            Shop shop3=new Shop("医保院","2.7千米",R.drawable.shop3,R.drawable.stars);
            shopList.add(shop3);
            Shop shop4=new Shop("平嘉大药房","7.4千米",R.drawable.shop4,R.drawable.stars2);
            shopList.add(shop4);
            Shop shop5=new Shop("平嘉大药房","4.2千米",R.drawable.shop5,R.drawable.stars);
            shopList.add(shop5);
            Shop shop6=new Shop("平嘉大药房","9.9千米",R.drawable.shop6,R.drawable.stars2);
            shopList.add(shop6);
        }

    }
}
