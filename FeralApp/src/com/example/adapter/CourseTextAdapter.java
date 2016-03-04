package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.CouseData;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
/**
 * 课程
 * @author Administrator
 *
 */
public class CourseTextAdapter extends BaseAdapter {
	ArrayList<CouseData> list;//课程数据的list
	LayoutInflater inflater;
	Context context;

	public CourseTextAdapter() {
		// TODO Auto-generated constructor stub
	}

	public CourseTextAdapter(Context context,ArrayList<CouseData> list) {
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
			convertView=inflater.inflate(R.layout.classify_text_items, null);
			holder = new Holder();
			holder.type=(TextView)convertView.findViewById(R.id.classify);
			holder.tags=(LinearLayout)convertView.findViewById(R.id.choices);
			convertView.setTag(holder);
		}
		holder=(Holder)convertView.getTag();
		CouseData data=list.get(position);
		holder.type.setText(data.getType());
		holder.addChoices(holder.tags, data.getTags(),data.getNumber());
		return convertView;
	}
	
	
	class Holder{
		TextView type;//分类
		LinearLayout tags;//每个分类下的标签
		/*
		 * 添加标签
		 */
		
		
		@SuppressLint("NewApi")
		public void addChoices(LinearLayout linearLayout, String[] str,int length){
			if(length!=0){//有数据
				
				int where=0;
				int row=((length-1)/3)+1;//行数
				for(int i=0;i<row;i++){
			//		System.out.println(length+"~~~~"+row);
					LinearLayout ll=new LinearLayout(context);//每一行添加一个linelayout默认为horizontal
					
					LinearLayout.LayoutParams params=
							new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
					
					for(int j=0;j<3&&where<length;j++){//每行三个，且总数不超过总长度
						//添加textview 设置文本内容
						TextView text = new TextView(context);
						text.setPadding(15, 8, 15, 8);
						text.setText(str[where]);
					
						text.setBackground(context.getResources().getDrawable(R.drawable.button));
						text.setLayoutParams(params);
						ll.addView(text);
						where++;
					}
					linearLayout.addView(ll);
				}
			}
			
		}

	}
	
	
	
	
		
	
}
