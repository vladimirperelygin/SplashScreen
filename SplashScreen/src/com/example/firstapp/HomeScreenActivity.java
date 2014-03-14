package com.example.firstapp;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeScreenActivity extends Activity {
	private ListView _list1;
	private String _data[] =
	{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
     "11","12","13", "14", "15", "16", "17", "18", "19", "20" };

	ArrayAdapter<String> adapter;
	  
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
		 
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.home_screen);
	    _list1=(ListView)findViewById(R.id.listView1);
	    adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , _data);
	    _list1.setAdapter(adapter);
	  
	   
	  }
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
	}
	
}

