package com.example.feralapp;

import android.app.Activity;
import android.os.Bundle;
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
	}

	public void innt() {
		ListView listView = (ListView) findViewById(R.id.list_view);
	}
}
