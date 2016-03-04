package com.example.adapter;



import com.example.feralapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SingleTypeAdapter extends BaseAdapter{
	String[] str;//分类
	Context context;
	LayoutInflater inflater;
	
	public SingleTypeAdapter() {
		// TODO Auto-generated constructor stub
	}
	public SingleTypeAdapter(Context context, String[] str){
		this.str=str;
		this.context=context;
		inflater=LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return str.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return str[position];
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
			convertView=inflater.inflate(R.layout.single_type_text, null);
			holder = new Holder();
			holder.text=(TextView)convertView.findViewById(R.id.single_title);
			convertView.setTag(holder);
		}
		holder=(Holder)convertView.getTag();
		holder.text.setText(str[position]);
		
		return convertView;
	}
	
	class Holder{
		TextView text;//分类
	}
	
	
}
