package com.example.feralapp;

import com.example.fragment.ClassifyByCourse;
import com.example.fragment.SingleTypeFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
/**
 * 分类页面
 * @author admin
 *
 */
public class ClassificationFragmentAcitivity extends FragmentActivity {
	FragmentManager fragmentManager=getSupportFragmentManager();
	ClassifyByCourse courseFragment = new ClassifyByCourse();
	SingleTypeFragment singleTypeFragment=new SingleTypeFragment();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
		fragmentTransaction.add(R.id.class_page,courseFragment);
		fragmentTransaction.add(R.id.class_page, singleTypeFragment);
		fragmentTransaction.hide(courseFragment);
		fragmentTransaction.commit();
		
	}
}
