package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.ClassifyByCourseListViewAdapter;
import com.example.feralapp.R;
import com.example.model.CourseData;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ClassifyByCourse extends Fragment {
	String[] type={"音乐","舞蹈","数学","语文"};
	String[] tag1={"音乐1"};
	
	CourseData data;
	ArrayList<CourseData> list=new ArrayList<CourseData>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view =inflater.inflate(R.layout.class_course, null);
		ListView listView = (ListView) view.findViewById(R.id.classsfy_list_view);
		for(int i=0;i<type.length;i++){
			data=new CourseData();
			data.setType(type[i]);
			data.setTags(tag1);
		
			list.add(data);
		}
		ClassifyByCourseListViewAdapter adapter=new ClassifyByCourseListViewAdapter(getActivity().getApplicationContext(),list);
		listView.setAdapter(adapter);
		return view;
	}
	
	
}
