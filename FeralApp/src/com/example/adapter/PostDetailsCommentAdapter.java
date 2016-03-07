package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.PostDetailsCommentInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PostDetailsCommentAdapter extends BaseAdapter {
	ArrayList<PostDetailsCommentInfo> infoList;
	Context context;
	LayoutInflater inflater;
	
	public PostDetailsCommentAdapter(Context applicationContext, ArrayList<PostDetailsCommentInfo> infoList) {
		// TODO Auto-generated constructor stub
		this.context=applicationContext;
		this.infoList=infoList;
		this.inflater=LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return infoList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return infoList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if(view==null){
			view=inflater.inflate(R.layout.post_details_comment_item, null);
			holder=new ViewHolder();
			holder.icon=(ImageView) view.findViewById(R.id.post_comment_user_icom);
			holder.commentText=(TextView) view.findViewById(R.id.post_comment_user_content);
			holder.commentTime=(TextView) view.findViewById(R.id.post_comment_time);
			view.setTag(holder);
			
		}
		holder=(ViewHolder) view.getTag();
		PostDetailsCommentInfo info=(PostDetailsCommentInfo) getItem(arg0);
		holder.icon.setBackgroundResource(info.getUserIcon());
		holder.commentText.setText(info.getCommentContent());
		holder.commentTime.setText(info.getCommentTime());
		return view;
	}
	class ViewHolder{
		ImageView icon;
		TextView commentText;
		TextView commentTime;
	}

}
