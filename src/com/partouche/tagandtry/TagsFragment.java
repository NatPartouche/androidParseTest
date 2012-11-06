package com.partouche.tagandtry;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class TagsFragment extends Fragment {

	public SimpleAdapter mAdapter;
	public ListView listview;
	public String[] values = new String[] { "Zara Opera", "Zara Velizy",
			"Zara Etoile" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
		View myview = inflater.inflate(R.layout.tagfragment, container, false);
		return myview;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		listview = (ListView) getActivity().findViewById(R.id.listshops);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, android.R.id.text1, values);

		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent = new Intent(getActivity(), NextActivity.class);
				intent.putExtra("titre", values[arg2]);
				startActivity(intent);
			}
		});

	}

}
