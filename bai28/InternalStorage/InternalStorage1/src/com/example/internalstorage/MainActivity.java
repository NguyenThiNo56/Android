package com.example.internalstorage;

import android.app.Activity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity{
	 
	Button btnread;
	EditText editdata;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 btnread=(Button) findViewById(R.id.btnreaddata);
	 editdata=(EditText) findViewById(R.id.editdata);
	 //btnread.setOnClickListener(this);
	}
	public void DocDuLieu(View v) {
		{
		readData();
		}
	}
	public void readData()
	{
		String data;
		InputStream in= getResources().openRawResource(R.drawable.myfile);
		InputStreamReader inreader=new InputStreamReader(in);
		BufferedReader bufreader=new BufferedReader(inreader);
		StringBuilder builder=new StringBuilder();
		if(in!=null)
		{
			try
			{
				while((data=bufreader.readLine())!=null)
				{
					builder.append(data);
					builder.append("\n");
				}
				in.close();
				editdata.setText(builder.toString());
			}
			catch(IOException ex){
				Log.e("ERROR", ex.getMessage());
			}
		}
	}
}
	 
