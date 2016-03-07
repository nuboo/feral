package com.example.feralapp;

import com.example.utils.TopSetting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 关于我们 Created by awx19 on 2016/3/6.
 */
public class AboutUsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		new TopSetting(this).topSetting("关于我们");
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		TextView about_us_introduce = (TextView) findViewById(R.id.about_us_introduce);// 介绍
		TextView textView = (TextView) findViewById(R.id.the_terms_of_service);// 服务条款
		textView.setOnClickListener(onClickListener);
	}

	/**
	 * 点击事件
	 */
	View.OnClickListener onClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.the_terms_of_service:

				break;
			default:
				break;
			}
		}
	};
}
