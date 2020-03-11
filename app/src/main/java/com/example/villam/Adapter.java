package com.example.villam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Farm> farmArrayList;

    public Adapter(Context context, int layout, ArrayList<Farm> farmArrayList) {
        this.context = context;
        this.layout = layout;
        this.farmArrayList = farmArrayList;
    }

    @Override
    public int getCount() {
        return farmArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtname = (TextView) convertView.findViewById(R.id.FarmName);
        TextView txtdiachi = (TextView) convertView.findViewById(R.id.diachiFarm);

        Farm farm = farmArrayList.get(position);

        txtname.setText(farm.getName());
        txtdiachi.setText(farm.getDiachi());

        return convertView;
    }
}
