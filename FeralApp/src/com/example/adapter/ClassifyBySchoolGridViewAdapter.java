package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.School;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * 课程分类GridView中图片以及教育机构名称的adapter
 * @author Administrator
 *
 */



public class ClassifyBySchoolGridViewAdapter extends BaseAdapter {
	ArrayList<School> list;
	Context context;
	LayoutInflater inflater;
	
	public ClassifyBySchoolGridViewAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	public ClassifyBySchoolGridViewAdapter(Context context, ArrayList<School> list){
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
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		Holder holder;
		if(arg1==null){
			arg1=inflater.inflate(R.layout.classification_by_school_gridview_items, null);
			holder=new Holder();
			holder.text=(TextView) arg1.findViewById(R.id.school_name);
			holder.img=(ImageView) arg1.findViewById(R.id.school_img);
			arg1.setTag(holder);
		}
		holder=(Holder)arg1.getTag();
		School school = list.get(arg0);
		holder.text.setText(school.getName());
		holder.img.setImageDrawable(school.getImg());
		return null;
	}
	
	class Holder{
		TextView text;
		ImageView img;
	}
	
}
