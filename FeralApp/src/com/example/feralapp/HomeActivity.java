package com.example.feralapp;

import java.util.ArrayList;

import com.example.adapter.HomeGridViewAdapter;
import com.example.customview.NoScrollGridView;
import com.example.model.CourseClassInfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class HomeActivity extends Activity {

	NoScrollGridView music_gridView;// 音乐类
	NoScrollGridView dance_gridView;// 舞蹈类
	NoScrollGridView calligraphy_gridView;// 书法类
	NoScrollGridView paint_gridView;// 绘画类
	NoScrollGridView other_gridView;// 其他
	RadioGroup bottomRadioGroup;// 底部RadioGroup
	ArrayList<CourseClassInfo> arrayList = new ArrayList<CourseClassInfo>();//ArrayList用来存放CourseClassInfo
	HomeGridViewAdapter adapter;//适配器

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		setData();//初始化测试数据
		initView();//初始化视图，控件
		adapter = new HomeGridViewAdapter(HomeActivity.this, arrayList);//实例化适配器，加载数据
		addList();//刷新gridView视图
	}
//gridView加载适配器
	private void addList() {
		// TODO Auto-generated method stub
		music_gridView.setAdapter(adapter);
		dance_gridView.setAdapter(adapter);
		calligraphy_gridView.setAdapter(adapter);
		paint_gridView.setAdapter(adapter);
		other_gridView.setAdapter(adapter);
	}
//设置测试数据
	public void setData() {
		for (int i = 0; i < 4; i++) {
			CourseClassInfo info = new CourseClassInfo();//创建CourseClassInfo对象
			//CourseClassInfo对象设值
			info.setClassIcon(R.drawable.test_icon);
			info.setClassTitle("二胡十段兴趣班");
			info.setClassPeople("已报1人");
			info.setClassSource("渝中汉昌");
			info.setClassArticle("乐器");
			info.setClassGrade("小学");
			info.setClassEndTime("3");
			arrayList.add(info);//将CourseClassInfo对象加载到ArrayList中
		}

	}
//初始化控件
	private void initView() {
		// TODO Auto-generated method stub
		//通过id加载NoScrollGridView控件
		music_gridView = (NoScrollGridView) findViewById(R.id.gridview_music_home);
		dance_gridView = (NoScrollGridView) findViewById(R.id.gridview_dance_home);
		calligraphy_gridView = (NoScrollGridView) findViewById(R.id.gridview_calligraphy_home);
		paint_gridView = (NoScrollGridView) findViewById(R.id.gridview_paint_home);
		other_gridView = (NoScrollGridView) findViewById(R.id.gridview_other_home);
		// 初始化RadioGroup
		bottomRadioGroup = (RadioGroup) findViewById(R.id.common_bottom_radiogroup);
		// 设置RadioGroup监听
		bottomRadioGroup.setOnCheckedChangeListener(radioGroupListener);
	}

	// RadioGroup监听
	OnCheckedChangeListener radioGroupListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup viewGroup, int arg1) {
			// TODO Auto-generated method stub
			switch (arg1) {
			case R.id.home_common_rdb:// 首页

				break;
			case R.id.category_common_rdb:// 分类

				break;
			case R.id.group_common_rdb:// 圈子

				break;
			case R.id.me_common_rdb:// 我

				break;
			
			}
		}
	};

}
