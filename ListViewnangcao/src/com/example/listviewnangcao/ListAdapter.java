package com.example.listviewnangcao;

import java.util.List;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.ArrayAdapter;

public class ListAdapter extends ArrayAdapter<SinhVien> {

	 public ListAdapter(Context context, int textViewResourceId) {
	      super(context, textViewResourceId);
	    }
	 public ListAdapter(Context context, int resource, List<SinhVien> items) {
	        super(context, resource, items);
	 	}

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {

	      View view = convertView;
	      	if (view == null) {
	          LayoutInflater inflater = LayoutInflater.from(getContext());
	          view =  inflater.inflate(R.layout.activity_dong_sinh_vien, null);
	        }
	      SinhVien p = getItem(position);
	        if (p != null) {
	           // Anh xa + Gan gia tri
	           TextView tt1 = (TextView) view.findViewById(R.id.textViewhoten);  
	           tt1 = setText(p.Hoten);
	           
	           TextView tt2 = (TextView) view.findViewById(R.id.textViewnamsinh);  
	           tt2 = setText(String.valueOf(p.Namsinh));
	        }
	        return view;
	    }
}