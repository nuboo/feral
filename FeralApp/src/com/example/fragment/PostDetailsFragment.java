package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.PostDetailsCommentAdapter;
import com.example.feralapp.R;
import com.example.model.PostDetailsCommentInfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
/**
 * 帖子详情页面 Fragment
 * @author Administrator
 *
 */
public class PostDetailsFragment extends Fragment {
	ArrayList<PostDetailsCommentInfo>  infoList=new ArrayList<PostDetailsCommentInfo>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.post_ditails, null);
		setData();
		ListView listView=(ListView) view.findViewById(R.id.comment_list);
		PostDetailsCommentAdapter adapter=new PostDetailsCommentAdapter(getActivity().getApplicationContext(),infoList);
		listView.setAdapter(adapter);
		return view;
	}
	public void setData(){
		for(int i=0;i<3;i++){
			PostDetailsCommentInfo info=new PostDetailsCommentInfo();
			info.setUserIcon(R.drawable.rub_course_default_user_icon);
			info.setCommentContent("Hello this is the test data!");
			info.setCommentTime("2016-3-4");
			infoList.add(info);
		}
		
		
	}
}
