package com.example.feralapp;

import com.example.utils.TopSetting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 发帖
 * 
 * @author admin
 *
 */
public class PostAMessageActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post_a_message);
		topSetting();
		innt();
	}

	public void innt() {
		EditText post_a_message_title = (EditText) findViewById(R.id.post_a_message_title);
		EditText post_a_message_text = (EditText) findViewById(R.id.post_a_message_text);
	}

	/**
	 * 顶部设置
	 */
	@SuppressLint("ResourceAsColor")
	public void topSetting() {
		new TopSetting(this).topSetting("发帖");
		TextView rub_course_share_btn = (TextView) findViewById(R.id.rub_course_share_btn);
		rub_course_share_btn.setText("发布");
		rub_course_share_btn.setTextColor(R.color.orange);
		rub_course_share_btn.setBackgroundResource(0);
		rub_course_share_btn.setOnClickListener(onClickListener);
	}

	/**
	 * 点击事件
	 */
	View.OnClickListener onClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.rub_course_share_btn://发布

				break;
			default:
				break;
			}
		}
	};
}
