package com.example.baichuyendoinamduong;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDoi=(Button) findViewById(R.id.button1);
        btnDoi.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arg0) {
        		EditText editnamduonglich = (EditText) findViewById(R.id.textView2);
        		int Year= Integer.parseInt(editnamduonglich.getText()+ "");
        		String can = null,chi = null;
        		switch(Year%10){
        			case 0 : can = "Canh"; break;
        			case 1 : can = "TÃ¢n"; break;
        			case 2 : can = "NhÃ¢m"; break;
        			case 3 : can = "QuÃ½"; break;
        			case 4 : can = "GiÃ¡p"; break;
        			case 5 : can = "áº¤t"; break;
        			case 6 : can = "BÃ­nh"; break;
        			case 7 : can = "Ä�inh"; break;
        			case 8 : can = "Máº­u"; break;
        			case 9 : can = "Ká»·"; break;	
        		}
        		switch(Year%12) {
        			case 0 : chi = "ThÃ¢n"; break;
        			case 1 : chi = "Dáº­u"; break;
        			case 2 : chi = "Tuáº¥t"; break;
        			case 3 : chi = "Há»£i"; break;
        			case 4 : chi = "TÃ½"; break;
        			case 5 : chi = "Sá»­u"; break;
        			case 6 : chi = "Dáº§n"; break;
        			case 7 : chi = "Máº¹o"; break;
        			case 8 : chi = "ThÃ¬n"; break;
        			case 9 : chi = "Tá»µ"; break;
        			case 10 : chi = "Ngá»�"; break;
        			case 11 : chi = "MÃ¹i"; break;
        		}
        		TextView txtkq = (TextView)findViewById(R.id.textView4);
                txtkq.setText(can+""+chi);
        	
        }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
    
