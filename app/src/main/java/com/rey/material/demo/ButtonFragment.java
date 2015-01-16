package com.rey.material.demo;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rey.material.app.*;
import com.rey.material.app.DialogFragment;
import com.rey.material.widget.Button;

import java.util.Calendar;

public class ButtonFragment extends Fragment{

	public static ButtonFragment newInstance(){
		ButtonFragment fragment = new ButtonFragment();
		
		return fragment;
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_button, container, false);
		
		Button bt_flat = (Button)v.findViewById(R.id.button_bt_flat);
		Button bt_flat_color = (Button)v.findViewById(R.id.button_bt_flat_color);
		Button bt_flat_wave = (Button)v.findViewById(R.id.button_bt_flat_wave);
		Button bt_flat_wave_color = (Button)v.findViewById(R.id.button_bt_flat_wave_color);
		Button bt_raise = (Button)v.findViewById(R.id.button_bt_raise);
		Button bt_raise_color = (Button)v.findViewById(R.id.button_bt_raise_color);
		Button bt_raise_wave = (Button)v.findViewById(R.id.button_bt_raise_wave);
		Button bt_raise_wave_color = (Button)v.findViewById(R.id.button_bt_raise_wave_color);
		Button bt_float = (Button)v.findViewById(R.id.button_bt_float);
		Button bt_float_color = (Button)v.findViewById(R.id.button_bt_float_color);
		Button bt_float_wave = (Button)v.findViewById(R.id.button_bt_float_wave);
		Button bt_float_wave_color = (Button)v.findViewById(R.id.button_bt_float_wave_color);
									
		View.OnClickListener listener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Button Clicked!\nEvent's fired when in anim end.", Toast.LENGTH_SHORT).show();				
			}
		};
		
		View.OnClickListener listener_delay = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Button Clicked!\nEvent's fired when out anim end.", Toast.LENGTH_SHORT).show();			
			}
		};
		
		bt_flat.setOnClickListener(listener);
		bt_flat_wave.setOnClickListener(listener);
		bt_raise.setOnClickListener(listener);
		bt_raise_wave.setOnClickListener(listener);
		bt_float.setOnClickListener(listener);
		bt_float_wave.setOnClickListener(listener);
		
		bt_flat_color.setOnClickListener(listener_delay);
		bt_flat_wave_color.setOnClickListener(listener_delay);
		bt_raise_color.setOnClickListener(listener_delay);
		bt_raise_wave_color.setOnClickListener(listener_delay);
		bt_float_color.setOnClickListener(listener_delay);
		bt_float_wave_color.setOnClickListener(listener_delay);

		return v;
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
	}
	
}
