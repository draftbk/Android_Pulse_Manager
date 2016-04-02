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
public class BookListAdapter extends ArrayAdapter<Book> {
    private Context context;
    private int resource_id;
    public BookListAdapter(Context context, int resource,List<Book> objects) {
        super(context, resource,objects);
        this.context=context;
        this.resource_id=resource;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        Book book=getItem(position);
        View view;
        ViewHolder viewHolder=new ViewHolder();
        view= LayoutInflater.from(getContext()).inflate(resource_id,null);
        viewHolder.title= (TextView) view.findViewById(R.id.text_title);
        viewHolder.book=(ImageView)view.findViewById(R.id.image_book);

        viewHolder.content= (TextView) view.findViewById(R.id.text_content);

        viewHolder.book.setImageResource(book.getImage_book());
        viewHolder.title.setText(book.getTitle());
        viewHolder.content.setText(book.getContent().substring(0,30));

        return view;
    }

    class ViewHolder{
        ImageView book;
        TextView title,content;
    }

}
