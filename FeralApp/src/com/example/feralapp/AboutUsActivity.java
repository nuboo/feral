package com.example.feralapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 关于我们
 * Created by awx19 on 2016/3/6.
 */
public class AboutUsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        innt();
    }

    /**
     * 初始化控件
     */
    public void innt() {
        TextView textView = (TextView) findViewById(R.id.the_terms_of_service);//服务条款
        textView.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
