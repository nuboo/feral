package com.example.utils;

import com.example.feralapp.R;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * 顶部设置
 */
public class TopSetting {
	Context context;
	Activity activity;

	public TopSetting(Context context) {
		this.context = context;
	}

	public void topSetting(String name) {
		if (activity == null) {
			activity = (Activity)context;
		}
		TextView rub_course_title = (TextView) activity.findViewById(R.id.rub_course_title);
		rub_course_title.setText(name);
		TextView rub_course_share_btn = (TextView) activity.findViewById(R.id.rub_course_share_btn);
		rub_course_share_btn.setVisibility(View.GONE);
		ImageButton rub_course_back_btn = (ImageButton) activity.findViewById(R.id.rub_course_back_btn);
		rub_course_back_btn.setOnClickListener(onClickListener);

	}

	/**
	 * 点击事件
	 */
	View.OnClickListener onClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.rub_course_back_btn:
				activity.finish();
				break;
			default:
				break;
			}
		}
	};
}
