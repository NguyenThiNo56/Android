package com.example.listviewnangcao;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.ArrayList;
import android.widget.ListView;


public class MainActivity extends Activity {
	ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listViewSinhVien);
        
        ArrayList<SinhVien> mangSinhVien = new ArrayList<SinhVien>();
        mangSinhVien.add(new SinhVien("Nguyễn Văn Tèo", 1987));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Ty", 1990));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Tun", 1988));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Tum", 1997));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Teo", 1967));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Tý", 1997));
        mangSinhVien.add(new SinhVien("Nguyễn Văn Tun", 1986));
        
        ListAdapter adapter = new ListAdapter(
        		MainActivity.this,
        		R.layout.activity_dong_sinh_vien,
        		mangSinhVien
        	);
       lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
