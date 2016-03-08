package com.example.feralapp;

import java.util.List;

import com.example.adapter.MyinvitationAdapter;
import com.example.model.Myinvitation;
import com.example.utils.TopSetting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * 我的帖子页面
 *
 * @author admin
 */
public class MyinvitationActivity extends Activity {
	/**
	 * 我的帖子的Adapter
	 */
	MyinvitationAdapter myinvitationAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myinvitation);
		new TopSetting(this).topSetting("我的帖子");
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		ListView listView = (ListView) findViewById(R.id.list_view);
		LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
		Myinvitation myinvitation = new Myinvitation();
		List<Myinvitation> list = myinvitation.data();
		if (list.size() == 0) {// 如果没有数据就显示帖子0记录页面
			listView.setVisibility(View.GONE);
			linearLayout.setVisibility(View.VISIBLE);
		} else {// 否则显示数据
			myinvitationAdapter = new MyinvitationAdapter(getApplicationContext(), list);
			listView.setAdapter(myinvitationAdapter);
		}
	}
}
