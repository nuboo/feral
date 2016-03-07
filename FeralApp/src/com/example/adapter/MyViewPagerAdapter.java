package com.example.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyViewPagerAdapter extends  FragmentPagerAdapter {
	ArrayList<Fragment> list;
	public MyViewPagerAdapter(FragmentManager fm , ArrayList<Fragment> list) {
		
		super(fm);
		this.list=list;
	
	}
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		  return (list == null || list.size() == 0) ? null
                  : list.get(arg0);
      
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	
	
	
}