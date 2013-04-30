package com.example.actionbartabs;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * This is an example app for how to implement ActionBar tabs using fragments
 * 
 * @author alexdrawbond
 */
public class MainActivity extends FragmentActivity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//put action bar in tab mode
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//set titles for tabs
		ActionBar.Tab tab1 = actionBar.newTab().setText("Tab1");
		ActionBar.Tab tab2 = actionBar.newTab().setText("Tab2");
		ActionBar.Tab tab3 = actionBar.newTab().setText("Tab3");

		//create instances of each of the fragments
		Fragment tab1Fragment = new Tab1Fragment();
		Fragment tab2Fragment = new Tab2Fragment();
		Fragment tab3Fragment = new Tab3Fragment();
		
		//attach those fragment instances to their respective tabs
		tab1.setTabListener(new MyTabsListener(tab1Fragment));
	    tab2.setTabListener(new MyTabsListener(tab2Fragment));
	    tab3.setTabListener(new MyTabsListener(tab3Fragment));
	    
	    //add each tab to the ActionBar
	    actionBar.addTab(tab1);
	    actionBar.addTab(tab2);
	    actionBar.addTab(tab3);
	}
}
