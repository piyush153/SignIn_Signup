package com.piyush.taskfirst.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.piyush.taskfirst.R;
import com.piyush.taskfirst.modals.ApiModel;


public class GridAdapter extends BaseAdapter {

    public  String name[];
    public  int images[];
    Context context;

    public GridAdapter(String[] name, int[] images, Context context) {
        this.name = name;
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.grid_item,null);

        ImageView img=(ImageView) view.findViewById(R.id.grid_image);
        TextView tv=(TextView) view.findViewById(R.id.item_name);

        img.setImageResource(images[i]);
        tv.setText(name[i]);

        return  view;
    }
}

