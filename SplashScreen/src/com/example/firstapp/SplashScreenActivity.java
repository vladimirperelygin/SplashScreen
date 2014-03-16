package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class SplashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.splash_screen);
		startShowHomeScreen();

	}

	public void startShowHomeScreen() {
		final Handler handler = new Handler();
		Runnable incrementRunnable = new Runnable() {

			@Override
			public void run() {
				Intent InHome = new Intent(SplashScreenActivity.this,
						HomeScreenActivity.class);
				SplashScreenActivity.this.startActivity(InHome);
				handler.postDelayed(this, 20000);
			}
		};

		handler.postDelayed(incrementRunnable, 2000);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
