package com.example.baitinhtong;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button tinhtong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tinhtong(View v){
		  EditText editSoa=(EditText)findViewById(R.id.textView2);
		int a=Integer.parseInt(editSoa.getText()+"");
		  EditText editSob =(EditText)findViewById(R.id.textView3);
		int b=Integer.parseInt(editSob.getText()+"");
		 TextView  txtkq=(TextView)findViewById(R.id.txtkq);
		txtkq.setText((a+b)+"");
	}

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
  }
  
}

