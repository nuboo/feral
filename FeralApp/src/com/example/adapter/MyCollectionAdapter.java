package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.MyCollection;

import android.R.integer;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCollectionAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<MyCollection> list;

	public MyCollectionAdapter(Context context, List<MyCollection> list) {
		this.context = context;
		this.list = list;
		inflater = LayoutInflater.from(context);
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
		HanderView handerView;
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.activity_my_collection_list_view_item, null);
			handerView = new HanderView();
			handerView.my_collection_img = (ImageView) convertView.findViewById(R.id.my_collection_img);
			handerView.my_collection_title = (TextView) convertView.findViewById(R.id.my_collection_title);
			handerView.my_collection_text = (TextView) convertView.findViewById(R.id.my_collection_text);
			handerView.my_collection_institutions = (TextView) convertView
					.findViewById(R.id.my_collection_institutions);
			handerView.my_collection_day = (TextView) convertView.findViewById(R.id.my_collection_day);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.my_collection_img.setBackgroundResource(list.get(position).getMy_collection_img());
		handerView.my_collection_title.setText(list.get(position).getMy_collection_title());
		handerView.my_collection_text.setText(list.get(position).getMy_collection_text());
		handerView.my_collection_institutions.setText(list.get(position).getMy_collection_institutions());
		handerView.my_collection_day.setText(list.get(position).getMy_collection_day());
		return convertView;
	}

	class HanderView {
		ImageView my_collection_img;
		TextView my_collection_title;
		TextView my_collection_text;
		TextView my_collection_institutions;
		TextView my_collection_day;
	}
}
