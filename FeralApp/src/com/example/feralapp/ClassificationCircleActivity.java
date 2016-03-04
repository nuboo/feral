package com.example.feralapp;

import com.example.adapter.ClassificationCircleAdapter;
import com.example.model.ClassificationCircle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * 圈子分类
 * 
 * @author admin
 *
 */
public class ClassificationCircleActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_circle_classification);
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		ListView listView = (ListView) findViewById(R.id.list_view);
		ClassificationCircleAdapter classificationCircleAdapter = new ClassificationCircleAdapter(
				getApplicationContext(), new ClassificationCircle().data());
		listView.setAdapter(classificationCircleAdapter);
	}

}
