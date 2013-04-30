package com.example.actionbartabs;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
/**
 * Swaps fragments based on the tab that is selected.
 * 
 * @author alexdrawbond
 */
public class MyTabsListener implements ActionBar.TabListener 
{
	public Fragment fragment;
	
	//default constructor
	public MyTabsListener(Fragment fragment)
	{
		this.fragment = fragment;
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) 
	{
		//if you want something special to happen when a user reselects
		//a tab, put that code here
	}

	//starts fragment when new tab is selected
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) 
	{
		ft.replace(R.id.fragment_placeholder, fragment);
	}

	//remove fragment when tab is unselected
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) 
	{
		ft.remove(fragment);
	}

}
