package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.MyViewPagerAdapter;
import com.example.feralapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ClassificationFragment extends Fragment {
	RadioGroup group;
	RadioButton course, school;
	FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
	ViewPager viewPager;
	ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
	ClassifyByCourse courseFragment = new ClassifyByCourse();// 课程
	ClassifyBySchool schoolFragment = new ClassifyBySchool();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.classification_page, null);
		group = (RadioGroup) view.findViewById(R.id.classify);
		course = (RadioButton) view.findViewById(R.id.classify_by_course);
		school = (RadioButton) view.findViewById(R.id.classify_by_school);
		course.setChecked(true);
		viewPager = (ViewPager) view.findViewById(R.id.class_page);
		group.setOnCheckedChangeListener(listener);
		fragmentList.add(courseFragment);
		fragmentList.add(schoolFragment);
		viewPager.setAdapter(new MyViewPagerAdapter(getChildFragmentManager(), fragmentList));
		/* viewPager.setOnPageChangeListener(listener); */
		return view;
	}

	OnCheckedChangeListener listener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			// TODO Auto-generated method stub
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
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
