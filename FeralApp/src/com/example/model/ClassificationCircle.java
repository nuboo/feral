package com.example.model;

import java.util.ArrayList;
import java.util.List;

import android.provider.ContactsContract.Contacts.Data;
import android.widget.ArrayAdapter;

/**
 * 圈子分类实体类
 * 
 * @author admin
 *
 */
public class ClassificationCircle {

	String circle_title;
	String circle_text;
	String circle_user_name;
	String circle_number;
	String circle_time;

	public String getCircle_title() {
		return circle_title;
	}

	public void setCircle_title(String circle_title) {
		this.circle_title = circle_title;
	}

	public String getCircle_text() {
		return circle_text;
	}

	public void setCircle_text(String circle_text) {
		this.circle_text = circle_text;
	}

	public String getCircle_user_name() {
		return circle_user_name;
	}

	public void setCircle_user_name(String circle_user_name) {
		this.circle_user_name = circle_user_name;
	}

	public String getCircle_number() {
		return circle_number;
	}

	public void setCircle_number(String circle_number) {
		this.circle_number = circle_number;
	}

	public String getCircle_time() {
		return circle_time;
	}

	public void setCircle_time(String circle_time) {
		this.circle_time = circle_time;
	}

	public List<ClassificationCircle> data() {
		List<ClassificationCircle> list = new ArrayList<ClassificationCircle>();
		for (int i = 0; i < 10; i++) {
			ClassificationCircle circle = new ClassificationCircle();
			circle.setCircle_title("中国文学大典");
			circle.setCircle_text("中国文学大典");
			circle.setCircle_user_name("菜豆");
			circle.setCircle_number("150");
			circle.setCircle_time("30分钟前");
			list.add(circle);
		}
		return list;
	}
}
