package com.example.feralapp;

import com.example.adapter.MessageAdapter;
import com.example.model.Message;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/**
 * 消息页面
 * 
 * @author admin
 *
 */
public class MessageActivity extends Activity {
	ListView listView;
	MessageAdapter messageAdapter;
	Message message = new Message();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		innt();
	}

	/**
	 * 初始化控件
	 */
	public void innt() {
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.message_radio_group);
		radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
		listView = (ListView) findViewById(R.id.list_view);
		listView.setOnItemLongClickListener(onItemLongClickListener);
	}

	/**
	 * RadioButton选择事件
	 */
	OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener() {
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch (group.getCheckedRadioButtonId()) {
			case R.id.message_unread:
				messageAdapter = new MessageAdapter(getApplicationContext(), message.data());// 加载未读消息
				listView.setAdapter(messageAdapter);
				break;
			case R.id.message_read:
				messageAdapter.updata(message.list());// 加载已读消息
				break;
			case R.id.message_all:
				messageAdapter.updata(message.getdata());// 全部消息
				break;
			default:
				break;
			}
		}
	};
	/**
	 * listView的item长按事件
	 */
	OnItemLongClickListener onItemLongClickListener = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			// TODO Auto-generated method stub
			return false;
		}
	};
}
