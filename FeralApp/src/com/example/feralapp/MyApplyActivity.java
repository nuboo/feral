package com.example.feralapp;

import com.example.utils.TopSetting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RadioGroup;

/**
 * 我的报名记录 Created by awx19 on 2016/3/6.
 */
public class MyApplyActivity extends Activity {
	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_apply_record);
		new TopSetting(this).topSetting("我的报名记录");
		innt();
	}

	/**
	 * 初始化控件
	 */
	private void innt() {
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.my_apply_radio_group);
		radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
		listView = (ListView) findViewById(R.id.list_view);

	}

	
	/**
	 * RadioButton选择事件
	 */
	RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch (group.getCheckedRadioButtonId()) {
			case R.id.my_apply_record_all:
				// 全部
				break;
			case R.id.my_apply_record_subscribe:
				// 预约
				break;
			case R.id.my_apply_record_accept:
				// 已受理
				break;

			default:
				break;
			}
		}
	};
}
