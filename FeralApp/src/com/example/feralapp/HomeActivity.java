package com.example.feralapp;

import java.util.ArrayList;

import com.example.adapter.HomeGridViewAdapter;
import com.example.customview.NoScrollGridView;
import com.example.fragment.CircleFragment;
import com.example.fragment.ClassificationFragment;
import com.example.fragment.ClassifyByCourse;
import com.example.fragment.HomePageFragment;
import com.example.model.CourseClassInfo;
import android.annotation.TargetApi;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class HomeActivity extends FragmentActivity {
	FragmentManager fragmentManager=getSupportFragmentManager();
	HomePageFragment homePage=new HomePageFragment();//首页
	FragmentTransaction fragmentTransaction;

	CircleFragment cirClePage=new CircleFragment();//圈子
	ClassificationFragment course = new ClassificationFragment();//分类
	RadioGroup bottomRadioGroup;// 底部RadioGroup
	
	HomeGridViewAdapter adapter;//适配器

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bottom_common);
		bottomRadioGroup = (RadioGroup) findViewById(R.id.common_bottom_radiogroup);
		// 设置RadioGroup监听
		bottomRadioGroup.setOnCheckedChangeListener(radioGroupListener);
		fragmentTransaction=fragmentManager.beginTransaction();
		fragmentTransaction.add(R.id.home_page_fragment_container, homePage);
		fragmentTransaction.add(R.id.home_page_fragment_container, cirClePage);
		fragmentTransaction.add(R.id.home_page_fragment_container, course);
		fragmentTransaction.hide(cirClePage);
		fragmentTransaction.hide(course);
		fragmentTransaction.commit();
	}



	// RadioGroup监听
	OnCheckedChangeListener radioGroupListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup viewGroup, int arg1) {
			// TODO Auto-generated method stub
			fragmentTransaction=fragmentManager.beginTransaction();
			
			switch (arg1) {
			case R.id.home_common_rdb:// 首页
				fragmentTransaction.show(homePage);
				fragmentTransaction.hide(cirClePage);
				fragmentTransaction.hide(course);
				fragmentTransaction.commit();
				break;
			case R.id.category_common_rdb:// 分类
				fragmentTransaction.hide(homePage);
				fragmentTransaction.hide(cirClePage);
				fragmentTransaction.show(course);
				fragmentTransaction.commit();
				break;
			case R.id.group_common_rdb:// 圈子
				fragmentTransaction.hide(homePage);
				fragmentTransaction.show(cirClePage);
				fragmentTransaction.hide(course);
				fragmentTransaction.commit();
				break;
			case R.id.me_common_rdb:// 我

				break;
			
			}
		}
	};

}
