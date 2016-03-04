package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.ClassificationCircle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * 圈子分类Adapter
 * @author admin
 *
 */
public class ClassificationCircleAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<ClassificationCircle> list;

	public ClassificationCircleAdapter(Context context, List<ClassificationCircle> list) {
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
			convertView = inflater.inflate(R.layout.activity_circle_list_view_item, null);
			handerView = new HanderView();
			handerView.circle_title = (TextView) convertView.findViewById(R.id.circle_title);
			handerView.circle_text = (TextView) convertView.findViewById(R.id.circle_text);
			handerView.circle_user_name = (TextView) convertView.findViewById(R.id.circle_user_name);
			handerView.circle_number = (TextView) convertView.findViewById(R.id.circle_number);
			handerView.circle_time = (TextView) convertView.findViewById(R.id.circle_time);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.circle_title.setText(list.get(position).getCircle_title());
		handerView.circle_text.setText(list.get(position).getCircle_text());
		handerView.circle_user_name.setText(list.get(position).getCircle_user_name());
		handerView.circle_number.setText(list.get(position).getCircle_number());
		handerView.circle_time.setText(list.get(position).getCircle_time());
		return convertView;
	}

	class HanderView {
		TextView circle_title;
		TextView circle_text;
		TextView circle_user_name;
		TextView circle_number;
		TextView circle_time;
	}

}
