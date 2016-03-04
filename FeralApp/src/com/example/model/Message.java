package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息实体类
 * 
 * @author admin
 *
 */
public class Message {
	String message_text;// 消息内容
	String message_time;// 消息时间

	public String getMessage_text() {
		return message_text;
	}

	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}

	public String getMessage_time() {
		return message_time;
	}

	public void setMessage_time(String message_time) {
		this.message_time = message_time;
	}

	/**
	 * 假数据
	 * 
	 * @return
	 */
	public List<Message> data() {
		List<Message> list = new ArrayList<Message>();
		for (int i = 0; i < 10; i++) {
			Message message = new Message();
			message.setMessage_text("未读消息");
			message.setMessage_time("2016-03-04");
			list.add(message);
		}
		return list;
	}

	public List<Message> list() {
		List<Message> list = new ArrayList<Message>();
		for (int i = 0; i < 10; i++) {
			Message message = new Message();
			message.setMessage_text("已读消息");
			message.setMessage_time("2016-03-04");
			list.add(message);
		}
		return list;
	}

	public List<Message> getdata() {
		List<Message> list = new ArrayList<Message>();
		for (int i = 0; i < 10; i++) {
			Message message = new Message();
			message.setMessage_text("全部消息");
			message.setMessage_time("2016-03-04");
			list.add(message);
		}
		return list;
	}
}
