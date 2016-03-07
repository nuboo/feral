package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.MyViewPagerAdapter;
import com.example.feralapp.R;
import com.example.feralapp.R.id;
import com.example.feralapp.R.layout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
/**
 * 分类页面
 * @author admin
 *
 */
import android.widget.RadioGroup.OnCheckedChangeListener;
@SuppressLint({ "NewApi", "InflateParams" })
public class ClassificationFragment extends Fragment {
	RadioGroup group;
	RadioButton course,school;
//	FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
	ViewPager viewPager;
	ArrayList<Fragment> fragmentList=new ArrayList<Fragment>();
	ClassifyByCourse courseFragment = new ClassifyByCourse();//课程
	ClassifyBySchool schoolFragment=new ClassifyBySchool();
	
/*	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		setContentView(R.layout.classification_page);
		group=(RadioGroup) findViewById(R.id.classify);
		course=(RadioButton) findViewById(R.id.classify_by_course);
		school=(RadioButton) findViewById(R.id.classify_by_school);
		course.setChecked(true);
		group.setOnCheckedChangeListener(listener);
		FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
		fragmentTransaction.add(R.id.class_page,courseFragment);
		fragmentTransaction.add(R.id.class_page, schoolFragment);
		fragmentTransaction.hide(schoolFragment);
		fragmentTransaction.commit();
		super.onCreate(arg0);
	}*/
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.classification_page, null);
		group=(RadioGroup) view.findViewById(R.id.classify);
		course=(RadioButton) view.findViewById(R.id.classify_by_course);
		school=(RadioButton) view.findViewById(R.id.classify_by_school);
		course.setChecked(true);
		viewPager=(ViewPager) view.findViewById(R.id.class_page);
		group.setOnCheckedChangeListener(listener);
		fragmentList.add(courseFragment);
		fragmentList.add(schoolFragment);
		viewPager.setAdapter(new MyViewPagerAdapter(getChildFragmentManager(), fragmentList));
	//	viewPager.setOnPageChangeListener(listener);
		return view;
	}
	
	OnCheckedChangeListener listener = new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			// TODO Auto-generated method stub
		//	FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
			switch (arg1) {
			case R.id.classify_by_course:
				viewPager.setCurrentItem(0);
				break;
			case R.id.classify_by_school:
				viewPager.setCurrentItem(1);
				break;

			default:
				break;
			}
		}
	};
}
