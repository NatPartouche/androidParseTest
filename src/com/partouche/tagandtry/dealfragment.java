package com.partouche.tagandtry;

import java.util.ArrayList;
import java.util.List;

import com.model.partouche.test;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import adapter.myadapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


public class dealfragment extends Fragment {

	List<test> mylist;
	ListView listview;

	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mylist = new ArrayList<test>();

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
		View myview = inflater.inflate(R.layout.dealsfragment, container, false);
		ParseQuery query = new ParseQuery("Vetement");
		
		query.findInBackground(new FindCallback() {

			public void done(List<ParseObject> arg0, ParseException arg1) {
				// TODO Auto-generated method stub

				for (int i = 0; i < arg0.size(); i++) {
					mylist.add(new test(arg0.get(i)));
				}
				myadapter adapter = new myadapter(getActivity(), mylist);
				listview.setAdapter(adapter);
			}
		});
		return myview;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		listview = (ListView) getActivity().findViewById(R.id.listdeals);

		myadapter adapter = new myadapter(getActivity(), mylist);

		if (listview.equals(null)) {

			listview = (ListView) getActivity().findViewById(R.id.listdeals);

			listview.setAdapter(adapter);

		}
	}
}
