package com.example.adapter;

import java.util.ArrayList;

import com.example.feralapp.R;
import com.example.model.CourseClassInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeGridViewAdapter extends BaseAdapter {

	Context context;
	LayoutInflater inflater;
	ArrayList<CourseClassInfo> info;

	public HomeGridViewAdapter() {
	}

	public HomeGridViewAdapter(Context context, ArrayList<CourseClassInfo> info) {
		this.context = context;
		this.info = info;
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return info.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return info.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if (view == null) {
			view = inflater.inflate(R.layout.home_gridview_item, null);
			holder = new ViewHolder();
			holder.iconDrawable = (ImageView) view.findViewById(R.id.grid_item_icon_home);
			holder.titleText = (TextView) view.findViewById(R.id.grid_item_title_home);
			holder.countText = (TextView) view.findViewById(R.id.grid_item_number_people_home);
			holder.sourceText = (TextView) view.findViewById(R.id.grid_item_name_home);
			holder.articleText = (TextView) view.findViewById(R.id.grid_item_course_article_home);
			holder.gradeText = (TextView) view.findViewById(R.id.grid_item_grade_home);
			holder.endTimeText = (TextView) view.findViewById(R.id.grid_item_end_time_home);
			view.setTag(holder);
		}
		holder = (ViewHolder) view.getTag();
		CourseClassInfo classInfo = (CourseClassInfo) getItem(position);
		holder.iconDrawable.setBackgroundResource(classInfo.getClassIcon());
		holder.titleText.setText(classInfo.getClassTitle());
		holder.countText.setText(classInfo.getClassPeople());
		holder.sourceText.setText(classInfo.getClassSource());
		holder.articleText.setText(classInfo.getClassArticle());
		holder.gradeText.setText(classInfo.getClassGrade());
		holder.endTimeText.setText(classInfo.getClassEndTime());
		return view;
	}

	class ViewHolder {
		ImageView iconDrawable;// 图标
		TextView titleText;// 标题
		TextView countText;// 报名人数统计
		TextView sourceText;// 培训方
		TextView articleText;// 培训方向
		TextView gradeText;// 级别
		TextView endTimeText;// 剩余报名时间
	}
}
