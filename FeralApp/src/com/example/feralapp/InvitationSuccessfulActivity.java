package com.example.feralapp;

import com.example.utils.TopSetting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 已受约页面
 * 
 * @author admin
 *
 */
public class InvitationSuccessfulActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_invitation_successful);
		new TopSetting(this).topSetting("已受约");
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		ImageView invitation_successful_img = (ImageView) findViewById(R.id.invitation_successful_img);
		TextView invitation_successful_text = (TextView) findViewById(R.id.invitation_successful_text);
	}
}
