package com.example.slf.pulse_manager.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.slf.pulse_manager.object.Medicine;
import com.example.slf.pulse_manager.adapter.MedicineListAdapter;
import com.example.slf.pulse_manager.R;

import java.util.ArrayList;

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
        for (int i=0;i<1;i++){
            Medicine medicine=new Medicine("金嗓子喉片","适用于改善急性咽炎所致的咽喉肿痛，干燥灼热，声音嘶哑",R.drawable.medicine1,R.drawable.stars,"6.5");
            medicineList.add(medicine);
            Medicine medicine2=new Medicine("健胃消食片","适用于脾胃虚弱所致的食积，症见不思饮食，嗳腐酸臭，脘腹胀满；消化不良的人群",R.drawable.medicine2,R.drawable.stars2,"7.5");
            medicineList.add(medicine2);
            Medicine medicine3=new Medicine("999感冒灵颗粒","本品解热镇痛。用于感冒引起的头痛，发热等",R.drawable.medicine3,R.drawable.stars,"9.9");
            medicineList.add(medicine3);
            Medicine medicine4=new Medicine("复方氨酚烷胺胶囊","用于缓解普通感冒及流行性感冒引起的发热、头痛、鼻塞、咽痛等症状，也可用于流行性感冒的预防和治疗。",R.drawable.medicine4,R.drawable.stars2,"9.8");
            medicineList.add(medicine4);
            Medicine medicine5=new Medicine("久铭银黄胶囊","清热解毒。用于急慢性扁桃体炎，急慢性咽喉炎，上呼吸道感染。",R.drawable.medicine5,R.drawable.stars2,"5.5");
            medicineList.add(medicine5);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.search_book) {
            Intent intent =new Intent(ShopDetailActivity.this,ConsultationActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
