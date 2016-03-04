package com.example.adapter;

import java.util.List;

import com.example.feralapp.R;
import com.example.model.Myinvitation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * 我的帖子Adapter
 * 
 * @author admin
 *
 */
public class MyinvitationAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;
	List<Myinvitation> list;

	public MyinvitationAdapter(Context context, List<Myinvitation> list) {
		this.list = list;
		this.context = context;
		inflater = LayoutInflater.from(context);
	}

	public void updata(List<Myinvitation> data) {
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
			convertView = inflater.inflate(R.layout.activity_myinvitation_list_view_item, null);
			handerView = new HanderView();
			handerView.myinvitation_text = (TextView) convertView.findViewById(R.id.myinvitation_text);
			handerView.myinvitation_time = (TextView) convertView.findViewById(R.id.myinvitation_time);
			handerView.myinvitation_grey = (TextView) convertView.findViewById(R.id.myinvitation_grey);
			handerView.myinvitation_comment = (TextView) convertView.findViewById(R.id.myinvitation_comment);
			convertView.setTag(handerView);
		} else {
			handerView = (HanderView) convertView.getTag();
		}
		handerView.myinvitation_text.setText(list.get(position).getMyinvitation_text());
		handerView.myinvitation_time.setText(list.get(position).getMyinvitation_time());
		handerView.myinvitation_grey.setText(list.get(position).getMyinvitation_grey());
		handerView.myinvitation_comment.setText(list.get(position).getMyinvitation_comment());
		return convertView;
	}

	class HanderView {
		TextView myinvitation_text;
		TextView myinvitation_time;
		TextView myinvitation_grey;
		TextView myinvitation_comment;
	}
}
