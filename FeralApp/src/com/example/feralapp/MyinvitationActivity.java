package com.example.feralapp;

import java.util.List;

import com.example.adapter.MyinvitationAdapter;
import com.example.model.Myinvitation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * 我的帖子页面
 * 
 * @author admin
 *
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
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		ListView listView = (ListView) findViewById(R.id.list_view);
		Myinvitation myinvitation = new Myinvitation();
		List<Myinvitation> list = myinvitation.data();
		if (list.size() == 0) {// 如果没有数据就显示帖子0记录页面

		} else {// 否则显示数据
			myinvitationAdapter = new MyinvitationAdapter(getApplicationContext(), list);
			listView.setAdapter(myinvitationAdapter);
		}

	}
}
