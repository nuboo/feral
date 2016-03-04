package com.example.adapter;

import java.util.ArrayList;


import com.example.customview.NoScrollGridView;
import com.example.feralapp.R;
import com.example.model.CourseData;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ClassifyBySchoolListViewAdapter extends BaseAdapter {
    ArrayList<CourseData> list;//�γ����ݵ�list
    LayoutInflater inflater;
    Context context;
    ClassifyBySchoolGridViewAdapter adapter;
    
    public ClassifyBySchoolListViewAdapter() {
        // TODO Auto-generated constructor stub
    }
    public ClassifyBySchoolListViewAdapter(Context context, ArrayList<CourseData> list){
        this.context=context;
        this.list=list;
        inflater=LayoutInflater.from(context);
    }
    
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return list.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.classification_listview_items, null);
            holder = new Holder();
            holder.type=(TextView)convertView.findViewById(R.id.classify_list_view_item_text);
            holder.tags=(NoScrollGridView)convertView.findViewById(R.id.choices);
            convertView.setTag(holder);
        }
        holder=(Holder)convertView.getTag();
        CourseData data=list.get(position);
        holder.type.setText(data.getType());
        if(data.getSchools()!=null){
            adapter=new ClassifyBySchoolGridViewAdapter(context, data.getSchools());
            holder.tags.setNumColumns(2);
            holder.tags.setAdapter(adapter);
        }
    
        
        return convertView;
    }
    
    class Holder{
        TextView type;//分类标题
        NoScrollGridView tags;//分类的图文
    }
}
