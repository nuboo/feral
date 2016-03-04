package com.example.adapter;

import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * 课程分类下每个课程下单独分类
 * @author Administrator
 *
 */



public class ClassifyByCourseGridViewAdapter extends BaseAdapter {
	String[] list;//每个类单独的分类标签
	Context context;
	LayoutInflater inflater;
	
	
	public ClassifyByCourseGridViewAdapter() {
		// TODO Auto-generated constructor stub
	}
	public ClassifyByCourseGridViewAdapter(Context context, String[] list){
		this.list=list;
		this.context=context;
		inflater=LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		Holder holder;
		if(arg1==null){
			arg1=inflater.inflate(R.layout.classification_by_course_grid_view_items, null);
			holder = new Holder();
			holder.text=(TextView) arg1.findViewById(R.id.grid_view_items_types_text);
			arg1.setTag(holder);
		}
			holder=(Holder)arg1.getTag();
			holder.text.setText(list[arg0]);//设置标签
			return arg1;
		
	}
	
	class Holder{
	TextView text;
		
	}
	
}
