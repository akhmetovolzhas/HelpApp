package com.example.kiori.helpapplogin2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoxAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<com.example.kiori.helpapplogin2.HelpRequest> objects;

    BoxAdapter(Context context, ArrayList<com.example.kiori.helpapplogin2.HelpRequest> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.activity_list_item_1, parent, false);
        }

        com.example.kiori.helpapplogin2.HelpRequest p = getProduct(position);

        ((TextView) view.findViewById(R.id.title)).setText(p.Title);
        ((TextView) view.findViewById(R.id.desc)).setText(p.Desc);

//        if(im != null){
//            ((BitmapDrawable) im.getDrawable()).getBitmap().recycle();
//        }
        ImageView im;
        im = (ImageView) view.findViewById(R.id.image_view);
        im.setImageResource(p.image);

        return view;
    }

    com.example.kiori.helpapplogin2.HelpRequest getProduct(int position) {
        return ((com.example.kiori.helpapplogin2.HelpRequest) getItem(position));
    }
}