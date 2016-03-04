package com.example.feralapp;

import java.util.ArrayList;

import com.example.adapter.HomeGridViewAdapter;
import com.example.customview.NoScrollGridView;
import com.example.model.CourseClassInfo;

import android.app.Activity;
import android.os.Bundle;


public class HomeActivity extends Activity {
	
	NoScrollGridView music_gridView;//音乐类
	NoScrollGridView dance_gridView;//舞蹈类
	NoScrollGridView calligraphy_gridView;//书法类
	NoScrollGridView paint_gridView;//绘画类
	NoScrollGridView other_gridView;//其他
	ArrayList<CourseClassInfo> arrayList=new ArrayList<CourseClassInfo>();
	HomeGridViewAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		setData();
		initGridView();
		adapter=new HomeGridViewAdapter(HomeActivity.this, arrayList);
		addList();
	}

	private void addList() {
		// TODO Auto-generated method stub
		 music_gridView.setAdapter(adapter);
		 dance_gridView.setAdapter(adapter);
		 calligraphy_gridView.setAdapter(adapter);
		 paint_gridView.setAdapter(adapter);
		 other_gridView.setAdapter(adapter);
	}
	public void setData(){
		for(int i=0;i<4;i++){
			CourseClassInfo info=new CourseClassInfo();
			info.setClassIcon(R.drawable.test_icon);
			info.setClassTitle("二胡十段兴趣班");
			info.setClassPeople("已报1人");
			info.setClassSource("渝中汉昌");
			info.setClassArticle("乐器");
			info.setClassGrade("小学");
			info.setClassEndTime("余3天");
			arrayList.add(info);
		}
		
	}
	private void initGridView() {
		// TODO Auto-generated method stub
		music_gridView=(NoScrollGridView) findViewById(R.id.gridview_music_home);
		dance_gridView=(NoScrollGridView) findViewById(R.id.gridview_dance_home);
		calligraphy_gridView=(NoScrollGridView) findViewById(R.id.gridview_calligraphy_home);
		paint_gridView=(NoScrollGridView) findViewById(R.id.gridview_paint_home);
		other_gridView=(NoScrollGridView) findViewById(R.id.gridview_other_home);
	}


}
