package com.example.administrator.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ${Administrator} on 2016/11/11 0011.
 */

public class Madapter extends BaseAdapter {
    private List<Bean> mList;
    private LayoutInflater layoutInflater;

    public Madapter(Context context,List<Bean> mList) {
        layoutInflater = LayoutInflater.from(context);
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view == null) {
            view = layoutInflater.inflate(R.layout.layout_item,parent,false);
            holder = new ViewHolder();
            holder.title = (TextView) view.findViewById(R.id.title);
            holder.content = (TextView) view.findViewById(R.id.content);
            holder.time = (TextView) view.findViewById(R.id.time);
            holder.number = (TextView) view.findViewById(R.id.number);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Bean bean = mList.get(position);
        holder.title.setText(bean.getTitle());
        holder.content.setText(bean.getContent());
        holder.time.setText(bean.getTime());
        holder.number.setText(bean.getNumber());
        return view;
    }

    public class ViewHolder {
        TextView title,content,time,number;
    }
}
