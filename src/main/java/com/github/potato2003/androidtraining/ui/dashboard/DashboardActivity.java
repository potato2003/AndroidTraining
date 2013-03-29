package com.github.potato2003.androidtraining.ui.dashboard;

import android.os.Bundle;
import android.view.Menu;

import com.github.potato2003.androidtraining.R;
import com.github.potato2003.androidtraining.R.layout;
import com.github.potato2003.androidtraining.R.menu;
import com.github.potato2003.androidtraining.ui.BaseActivity;

public class DashboardActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
