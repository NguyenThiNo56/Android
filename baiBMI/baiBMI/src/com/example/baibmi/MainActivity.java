package com.example.baibmi;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Chuyen(View v){
    	EditText editTen=(EditText) findViewById(R.id.textView2);
    	EditText editchieucao=(EditText) findViewById(R.id.textView3);
    	EditText editcannang=(EditText) findViewById(R.id.textView4);
    	EditText editBMI=(EditText) findViewById(R.id.textView5);
    	EditText editchandoan=(EditText) findViewById(R.id.textView6);
    	double H=Double.parseDouble(editchieucao.getText()+"");
    	double W=Double.parseDouble(editcannang.getText()+"");
    	double BMI=W/Math.pow(H, 2);
    	String chandoan="";
    	if(BMI<18)
    	{
    	chandoan="Bạn gầy";
    	}
    	else if(BMI<=24.9)
    	{
    	chandoan="Bạn bình thường";
    	}
    	else if(BMI<=29.9)
    	{
    	chandoan="Bạn béo gầy độ 1";
    	}
    	else if(BMI<=34.9)
    	{
    	chandoan="Bạn béo gầy độ 2";
    	}
    	else
    	{
    	chandoan="Bạn béo phì độ 3";
    	}
    	DecimalFormat dcf=new DecimalFormat("#.0");
    	editBMI.setText(dcf.format(BMI));
    	editchandoan.setText(chandoan);
  }
    @Override
   
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
