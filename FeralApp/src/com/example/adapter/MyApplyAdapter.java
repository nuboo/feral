package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.MyApply;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 我的报名记录adapter
 * 
 * @author admin
 *
 */
public class MyApplyAdapter extends BaseAdapter {

	Context context;
	LayoutInflater inflater;
	List<MyApply> list;

	public MyApplyAdapter(Context context, List<MyApply> list) {
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
			convertView = inflater.inflate(R.layout.activity_my_apply_record_item, null);
			handerView = new HanderView();
			handerView.my_apply_img = (ImageView) convertView.findViewById(R.id.my_apply_img);
			handerView.my_apply_title = (TextView) convertView.findViewById(R.id.my_apply_title);
			handerView.my_apply_institutions = (TextView) convertView.findViewById(R.id.my_apply_institutions);
			handerView.my_apply_time = (TextView) convertView.findViewById(R.id.my_apply_time);
			handerView.my_apply_day = (TextView) convertView.findViewById(R.id.my_apply_day);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.my_apply_img.setBackgroundResource(list.get(position).getMy_apply_img());
		handerView.my_apply_title.setText(list.get(position).getMy_apply_title());
		handerView.my_apply_institutions.setText(list.get(position).getMy_apply_institutions());
		handerView.my_apply_time.setText(list.get(position).getMy_apply_time());
		handerView.my_apply_day.setText(list.get(position).getMy_apply_day());
		return convertView;
	}

	class HanderView {
		ImageView my_apply_img;
		TextView my_apply_title;
		TextView my_apply_institutions;
		TextView my_apply_time;
		TextView my_apply_day;
	}

}
