/*
 * Copyright (C) 2012 yueyueniao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.slidingmenu.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.slidingmenu.R;

public class LeftFragment extends Fragment implements OnClickListener {

	TextView tv1;
	TextView tvMyfocus;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.left, null);
		tv1 = (TextView)view.findViewById(R.id.name_textview);
		tvMyfocus = (TextView)view.findViewById(R.id.my_focus_textview);
		
		tv1.setOnClickListener(this);
		tvMyfocus.setOnClickListener(this);
		return view;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int id = arg0.getId();
		switch(id){
			case R.id.name_textview:
				Log.d("JUIDBG","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				break;
				
			case R.id.my_focus_textview:
				Log.d("JUIDBG","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				break;
		}
	}

}
