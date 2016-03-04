package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的帖子实体类
 * 
 * @author admin
 *
 */
public class Myinvitation {

	String myinvitation_text;// 帖子内容
	String myinvitation_time;// 帖子时间
	String myinvitation_grey;// 赞数量
	String myinvitation_comment;// 评论数量

	public String getMyinvitation_text() {
		return myinvitation_text;
	}

	public void setMyinvitation_text(String myinvitation_text) {
		this.myinvitation_text = myinvitation_text;
	}

	public String getMyinvitation_time() {
		return myinvitation_time;
	}

	public void setMyinvitation_time(String myinvitation_time) {
		this.myinvitation_time = myinvitation_time;
	}

	public String getMyinvitation_grey() {
		return myinvitation_grey;
	}

	public void setMyinvitation_grey(String myinvitation_grey) {
		this.myinvitation_grey = myinvitation_grey;
	}

	public String getMyinvitation_comment() {
		return myinvitation_comment;
	}

	public void setMyinvitation_comment(String myinvitation_comment) {
		this.myinvitation_comment = myinvitation_comment;
	}

	/**
	 * 假数据
	 * 
	 * @return
	 */
	public List<Myinvitation> data() {
		List<Myinvitation> list = new ArrayList<Myinvitation>();
		for (int i = 0; i < 10; i++) {
			Myinvitation myinvitation = new Myinvitation();
			myinvitation.setMyinvitation_text("我是如何考上高级UI设计师的");
			myinvitation.setMyinvitation_time("2016-03-04");
			myinvitation.setMyinvitation_grey("1024");
			myinvitation.setMyinvitation_comment("4565");
			list.add(myinvitation);
		}
		return list;
	}
}
