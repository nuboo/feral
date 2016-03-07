package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.example.feralapp.R;

/**
 * 我的收藏实体类
 * 
 * @author admin
 *
 */
public class MyCollection {

	int my_collection_img;
	String my_collection_title;
	String my_collection_text;
	String my_collection_institutions;
	String my_collection_day;

	public int getMy_collection_img() {
		return my_collection_img;
	}

	public void setMy_collection_img(int my_collection_img) {
		this.my_collection_img = my_collection_img;
	}

	public String getMy_collection_title() {
		return my_collection_title;
	}

	public void setMy_collection_title(String my_collection_title) {
		this.my_collection_title = my_collection_title;
	}

	public String getMy_collection_text() {
		return my_collection_text;
	}

	public void setMy_collection_text(String my_collection_text) {
		this.my_collection_text = my_collection_text;
	}

	public String getMy_collection_institutions() {
		return my_collection_institutions;
	}

	public void setMy_collection_institutions(String my_collection_institutions) {
		this.my_collection_institutions = my_collection_institutions;
	}

	public String getMy_collection_day() {
		return my_collection_day;
	}

	public void setMy_collection_day(String my_collection_day) {
		this.my_collection_day = my_collection_day;
	}

	public List<MyCollection> data() {
		List<MyCollection> list = new ArrayList<MyCollection>();
		for (int i = 0; i < 3; i++) {
			MyCollection myCollection = new MyCollection();
			myCollection.setMy_collection_img(R.drawable.ic_launcher);
			myCollection.setMy_collection_title("二胡十段兴趣班");
			myCollection.setMy_collection_text("1");
			myCollection.setMy_collection_institutions("渝中汉昌");
			myCollection.setMy_collection_day("3");
			list.add(myCollection);
		}
		return list;
	}
}
