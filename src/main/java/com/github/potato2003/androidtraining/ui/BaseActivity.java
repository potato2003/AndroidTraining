package com.github.potato2003.androidtraining.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.github.potato2003.androidtraining.MyApplication;

public class BaseActivity extends Activity {

	private static final String TAG = BaseActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onStart() {
		Log.d(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		Log.d(TAG, "onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.d(TAG, "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.d(TAG, "onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onNewIntent(Intent intent) {
		Log.d(TAG, "onNewIntent");
		super.onDestroy();
	}

	public MyApplication getMyApplication() {
		return (MyApplication) getApplication();
	}

	protected Activity getOwnerActivity() {
		return this;
	}

}
