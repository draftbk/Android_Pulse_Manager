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

import com.example.slf.pulse_manager.object.Book;
import com.example.slf.pulse_manager.R;
import com.example.slf.pulse_manager.activity.ArticleActivity;
import com.example.slf.pulse_manager.adapter.BookListAdapter;

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
        for (int i=0;i<1;i++){
            Book book=new Book("喝水的养生学问","水是生命之源，我们每个人每天都会喝水，喝水能够排除体内的毒素，还能够预防很多疾病的发生，但是你真的知道怎样才算是健康喝水么？",R.drawable.book1);
            bookList.add(book);
            Book book2=new Book("春季养生食谱","到了春天的时候，经过一冬天的洗礼，很多人都没有在外面活动了，虽然在冬天的时候也会注意养生，但是到了春天就要转变方法啦，那么春天有什么养生的食物吗？和大家分享一下。",R.drawable.image_book2);
            bookList.add(book2);
            Book book3=new Book("养生之本，竟...","传统的养生观念是十分重视清晨起床后的养生的，天人合一、遵循天时是传统养生观的一大特色，养生之本在于醒来的十分钟内。",R.drawable.image_book3);
            bookList.add(book3);
            Book book4=new Book("养生十条，竟...","1、衣不过暖穿衣戴帽不要过于暖和，也不可以过于单薄，过暖容易感冒，过冷容易受寒。",R.drawable.image_book4);
            bookList.add(book4);
        }

    }
}
