package com.example.fragment;

import com.example.adapter.CircleAdapter;
import com.example.feralapp.R;
import com.example.model.Circle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * 圈子页面
 * 
 * @author admin
 *
 */
public class CircleFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.activity_circle, null);
		ListView listView = (ListView) view.findViewById(R.id.list_view);
		CircleAdapter adapter = new CircleAdapter(getActivity().getApplicationContext(), new Circle().data());
		listView.setAdapter(adapter);
		return view;
	}
}
