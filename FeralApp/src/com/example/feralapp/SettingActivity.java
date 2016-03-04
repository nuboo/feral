package com.example.feralapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 设置页面
 * 
 * @author admin
 *
 */
public class SettingActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
	}

	public void innt() {
		LinearLayout setting_about_us = (LinearLayout) findViewById(R.id.setting_about_us);
		LinearLayout setting_clear_the_cache = (LinearLayout) findViewById(R.id.setting_clear_the_cache);
		TextView setting_cache_size = (TextView) findViewById(R.id.setting_cache_size);// 缓存大小
		TextView setting_cancellation = (TextView) findViewById(R.id.setting_cancellation);
		setting_about_us.setOnClickListener(onClickListener);
		setting_clear_the_cache.setOnClickListener(onClickListener);
		setting_cancellation.setOnClickListener(onClickListener);
	}

	/**
	 * 点击事件
	 */
	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.setting_about_us:// 关于我们
				
				break;
			case R.id.setting_clear_the_cache:// 清空缓存
				
				break;
			case R.id.setting_cancellation:// 退出账号
				
				break;
			}
		}
	};
}
