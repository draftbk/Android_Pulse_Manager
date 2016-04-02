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
public class MyFragment3 extends Fragment {
    private ArrayList<Book> bookList;
    private ListView listView;
    private BookListAdapter adapter;
    private Context context;
    private Activity activity;
    private View view;
    public MyFragment3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,container,false);
        context=getActivity();
        activity=getActivity();
        bookList=new ArrayList<Book>();
        listView= (ListView) view.findViewById(R.id.list_book);
        initList();
        adapter=new BookListAdapter(activity,R.layout.book_item,bookList);
        Log.d("test","1");
        listView.setAdapter(adapter);
        Log.d("test", "2");
        //Log.d("test", "exapmple" + example);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id1) {
                Log.d("test","adadada");
                Intent intent=new Intent(context,ArticleActivity.class);
                startActivity(intent);

            }
        });
        return view;
    }

    private void initList() {
        for (int i=0;i<=5;i++){
            Book book=new Book("喝水的养生学问","水是生命之源，我们每个人每天都会喝水，喝水能够排除体内的毒素，还能够预防很多疾病的发生，但是你真的知道怎样才算是健康喝水么？",R.drawable.book1);
            bookList.add(book);
        }

    }
}
