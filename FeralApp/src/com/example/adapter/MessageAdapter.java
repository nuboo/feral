package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MessageAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<Message> list;

	public MessageAdapter(Context context, List<Message> list) {
		this.list = list;
		this.context = context;
		inflater = LayoutInflater.from(context);
	}

	public void updata(List<Message> data) {
		list = data;
		notifyDataSetChanged();
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
			convertView = inflater.inflate(R.layout.activity_message_list_view_item, null);
			handerView = new HanderView();
			handerView.message_title = (TextView) convertView.findViewById(R.id.message_title);
			handerView.message_time = (TextView) convertView.findViewById(R.id.message_time);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.message_title.setText(list.get(position).getMessage_text());
		handerView.message_time.setText(list.get(position).getMessage_time());
		return convertView;
	}

	class HanderView {
		TextView message_title;
		TextView message_time;
	}

}
