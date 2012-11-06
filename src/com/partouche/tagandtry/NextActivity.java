package com.partouche.tagandtry;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class NextActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_next, menu);
		Intent intent = this.getIntent();
		if (intent.hasExtra("titre")) {
			TextView textveiw = (TextView) findViewById(R.id.valuenext);
			textveiw.setText(intent.getStringExtra("titre"));
		}
		return true;
	}
}
