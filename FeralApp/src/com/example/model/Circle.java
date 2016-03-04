package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.example.feralapp.R;

/**
 * 圈子实体类
 * 
 * @author admin
 *
 */
public class Circle {
	int circle_img;
	String circle_literature;
	int person_nub;
	String circle_love_literature;

	public int getCircle_img() {
		return circle_img;
	}

	public void setCircle_img(int circle_img) {
		this.circle_img = circle_img;
	}

	public String getCircle_literature() {
		return circle_literature;
	}

	public void setCircle_literature(String circle_literature) {
		this.circle_literature = circle_literature;
	}

	public int getPerson_nub() {
		return person_nub;
	}

	public void setPerson_nub(int person_nub) {
		this.person_nub = person_nub;
	}

	public String getCircle_love_literature() {
		return circle_love_literature;
	}

	public void setCircle_love_literature(String circle_love_literature) {
		this.circle_love_literature = circle_love_literature;
	}

	/**
	 * 假数据
	 * 
	 * @return
	 */
	public List<Circle> data() {
		List<Circle> list = new ArrayList<Circle>();
		for (int i = 0; i < 10; i++) {
			Circle circle = new Circle();
			circle.setCircle_img(R.drawable.ic_launcher);
			circle.setCircle_literature("同城英语圈");
			circle.setPerson_nub(1025);
			circle.setCircle_love_literature("热爱英语，疯狂英语");
			list.add(circle);
		}
		return list;
	}
}
