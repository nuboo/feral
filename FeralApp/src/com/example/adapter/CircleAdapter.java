package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.Circle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 圈子适配器
 * 
 * @author admin
 *
 */
public class CircleAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<Circle> list;

	public CircleAdapter(Context context, List<Circle> list) {
		this.list = list;
		this.context = context;
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
			convertView = inflater.inflate(R.layout.activity_circle_list_view_items, null);
			handerView = new HanderView();
			handerView.circle_img = (ImageView) convertView.findViewById(R.id.circle_img);
			handerView.circle_literature = (TextView) convertView.findViewById(R.id.circle_literature);
			handerView.person_nub = (TextView) convertView.findViewById(R.id.person_nub);
			handerView.circle_love_literature = (TextView) convertView.findViewById(R.id.circle_love_literature);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.circle_img.setBackgroundResource(list.get(position).getCircle_img());
		handerView.circle_literature.setText(list.get(position).getCircle_literature());
		handerView.person_nub.setText("" + list.get(position).getPerson_nub());
		handerView.circle_love_literature.setText(list.get(position).getCircle_love_literature());
		return convertView;
	}

	class HanderView {
		ImageView circle_img;
		TextView circle_literature;
		TextView person_nub;
		TextView circle_love_literature;
	}
}
