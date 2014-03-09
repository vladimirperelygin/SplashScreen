package com.example.firstapp;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;


public class Splash_Screen extends Activity  {
	
	@Override
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        setContentView(R.layout.splash_screen);
        splash();
      
        } 
	
       public void splash()
       {
    	   Timer t = new Timer();  

           TimerTask task = new TimerTask() {  

            @Override  
            public void run() {  
             runOnUiThread(new Runnable() {  

              @Override  
              public void run() {  
           	  setContentView(R.layout.home_screen); 
              }  
            });  
            }  
          }; 
            t.schedule( task, 2000 ); 
       }

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	

}
