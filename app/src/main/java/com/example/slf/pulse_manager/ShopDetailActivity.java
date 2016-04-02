package com.example.slf.pulse_manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ShopDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt2,bt3;
    private ListView listView;
    private MedicineListAdapter adapter;
    private ArrayList<Medicine> medicineList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_detail);
        this.setTitle("平嘉大药房");
        init();
        medicineList=new ArrayList<Medicine>();
        listView= (ListView)findViewById(R.id.list_medicine);
        initList();
        adapter=new MedicineListAdapter(ShopDetailActivity.this,R.layout.medicine_item,medicineList);
        Log.d("test", "1");
        listView.setAdapter(adapter);
        Log.d("test", "2");
        //Log.d("test", "exapmple" + example);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id1) {
                Log.d("test", "adadada");

            }
        });

    }

    private void initList() {
        for (int i=0;i<6;i++){
            Medicine medicine=new Medicine("金嗓子喉片","适用于改善急性咽炎所致的咽喉肿痛，干燥灼热，声音嘶哑",R.drawable.medicine1,R.drawable.stars,"6.5");
            medicineList.add(medicine);
        }


    }

    //各种控件初始化
    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "显示加入购物车的东西", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        bt2= (Button) findViewById(R.id.bt2);
        bt3= (Button) findViewById(R.id.bt3);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt2:
                Toast.makeText(ShopDetailActivity.this, "开发中", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt3:
                Toast.makeText(ShopDetailActivity.this, "开发中", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
