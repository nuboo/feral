package com.example.fragment;



import com.example.adapter.SingleTypeAdapter;
import com.example.customview.HorizontalListView;
import com.example.feralapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SingleTypeFragment extends Fragment {
	String[] str={"1","2","3","4"};
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view =inflater.inflate(R.layout.single_type, null);
		HorizontalListView listView = (HorizontalListView) view.findViewById(R.id.horizontal_list_view);
		SingleTypeAdapter adapter=new SingleTypeAdapter(getActivity().getApplicationContext(), str);
		listView.setAdapter(adapter);
		return view;
	}
}
