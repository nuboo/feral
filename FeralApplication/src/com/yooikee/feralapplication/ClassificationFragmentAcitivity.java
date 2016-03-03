
package com.yooikee.feralapplication;
import com.fragment.ClassifyByCourse;
import com.fragment.SingleTypeFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

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
