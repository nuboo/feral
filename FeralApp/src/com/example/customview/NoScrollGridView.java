package com.example.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * 自定义的一个GridView 使得其可以在带滑动的控件下实现滑动功能
 * @author Administrator
 *
 */
public class NoScrollGridView extends GridView{

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
	public NoScrollGridView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public NoScrollGridView(Context context, AttributeSet attrs) {
		super(context,attrs);
	}
}
