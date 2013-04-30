package com.example.actionbartabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * See Tab1Fragment comments. 
 * 
 * @author alexdrawbond
 */
public class Tab2Fragment extends Fragment 
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View view = inflater.inflate(R.layout.tab2_fragment, container, false);

		return view;
	}

}
