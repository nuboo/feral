package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.HomeGridViewAdapter;
import com.example.customview.NoScrollGridView;
import com.example.feralapp.HomeActivity;
import com.example.feralapp.R;
import com.example.model.CourseClassInfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

public class HomePageFragment extends Fragment {
	NoScrollGridView music_gridView;// 音乐类
	NoScrollGridView dance_gridView;// 舞蹈类
	NoScrollGridView calligraphy_gridView;// 书法类
	NoScrollGridView paint_gridView;// 绘画类
	NoScrollGridView other_gridView;// 其他
	
	ArrayList<CourseClassInfo> arrayList = new ArrayList<CourseClassInfo>();//ArrayList用来存放CourseClassInfo
	HomeGridViewAdapter adapter;//适配器
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view =inflater.inflate(R.layout.activity_home, null);
		setData();//初始化测试数据
		music_gridView=(NoScrollGridView) view.findViewById(R.id.gridview_music_home);
		dance_gridView=(NoScrollGridView) view.findViewById(R.id.gridview_music_home);
		paint_gridView=(NoScrollGridView) view.findViewById(R.id.gridview_paint_home);
		other_gridView=(NoScrollGridView) view.findViewById(R.id.gridview_other_home);
		calligraphy_gridView= (NoScrollGridView) view.findViewById(R.id.gridview_calligraphy_home);
		adapter = new HomeGridViewAdapter(getActivity().getApplicationContext(), arrayList);//实例化适配器，加载数据
		addList();//刷新gridView视图
	


		
		
		return view;
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
	
	//gridView加载适配器
		private void addList() {
			// TODO Auto-generated method stub
	
			
			music_gridView.setAdapter(adapter);
			dance_gridView.setAdapter(adapter);
			calligraphy_gridView.setAdapter(adapter);
			paint_gridView.setAdapter(adapter);
			other_gridView.setAdapter(adapter);
		}

}
