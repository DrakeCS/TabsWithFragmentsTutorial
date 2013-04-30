package com.example.actionbartabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * This is a basic example of a fragment.
 * 
 * @author alexdrawbond
 */
public class Tab1Fragment extends Fragment 
{
	//This method is responsible for inflating the fragment's layout 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View view = inflater.inflate(R.layout.tab1_fragment, container, false);

		return view;
	}
}
