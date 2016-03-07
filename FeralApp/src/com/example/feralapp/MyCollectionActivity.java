package com.example.feralapp;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.MyCollectionAdapter;
import com.example.model.MyCollection;
import com.example.utils.TopSetting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * 我的收藏
 * 
 * @author admin
 *
 */
public class MyCollectionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_collection);
		new TopSetting(this).topSetting("我的收藏");
		innt();
	}

	public void innt() {
		ListView listView = (ListView) findViewById(R.id.list_view);
		LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
		List<MyCollection> list = new ArrayList<MyCollection>();
		list = new MyCollection().data();
		if (list.size() == 0) {// 如果没有数据显示LinearLayout
			listView.setVisibility(View.GONE);
			linearLayout.setVisibility(View.VISIBLE);
		} else {// 否则显示listView
			MyCollectionAdapter myCollectionAdapter = new MyCollectionAdapter(getApplicationContext(), list);
			listView.setAdapter(myCollectionAdapter);
		}
	}

}
