package com.example.adapter;

import java.util.ArrayList;

import com.example.customview.NoScrollGridView;
import com.example.feralapp.R;
import com.example.model.CourseData;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
/**
 * 分类首页的listView的adapter
 * 
 * 
 */


public class ClassifyByCourseListViewAdapter extends BaseAdapter {
	ArrayList<CourseData> list;//课程数据的list
	LayoutInflater inflater;
	Context context;
	ClassifyByCourseGridViewAdapter adapter;
	public ClassifyByCourseListViewAdapter() {
		// TODO Auto-generated constructor stub
	}

	public ClassifyByCourseListViewAdapter(Context context,ArrayList<CourseData> list) {
		this.list=list;
		this.context=context;
		inflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Holder holder;
		if(convertView==null){
			convertView=inflater.inflate(R.layout.classification_list_view_items, null);
			holder = new Holder();
			holder.type=(TextView)convertView.findViewById(R.id.classify);
			holder.tags=(NoScrollGridView)convertView.findViewById(R.id.choices);
			convertView.setTag(holder);
		}
		holder=(Holder)convertView.getTag();
		CourseData data=list.get(position);
		holder.type.setText(data.getType());
		String[] gettags=data.getTags();
		adapter=new ClassifyByCourseGridViewAdapter(context, gettags);
		holder.tags.setNumColumns(3);
		holder.tags.setAdapter(adapter);
		return convertView;
	}
	
	
	class Holder{
		TextView type;//分类
		NoScrollGridView tags;//每个分类下的标签
		
	}
	
	
	
	
		
	
}
