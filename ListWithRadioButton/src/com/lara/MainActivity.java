package com.lara;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	private ListView listView;
	private ArrayList<Model> dataList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dataList = new ArrayList<Model>();
        setData();
        listView = (ListView)findViewById(R.id.ListView01);
        
       
       CustomListAdapter cadapter = new CustomListAdapter(MainActivity.this, dataList);
       listView.setAdapter(cadapter);
        
        
    }
    private void setData(){
    	
    	Model m = new Model("Ik word op de hoogte gehouden van de ontwikkelingen binnen onze organisatie.");
    	
    	dataList.add(m);
    	
    	Model m1 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m1);
    	Model m2 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m2);
    	Model m3 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m3);
    	Model m4 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m4);
    	Model m5 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m5);
    	Model m6 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m6);
    	Model m7 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m7);
    	Model m8 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m8);
    	Model m9 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m9);
    	Model m10 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m10);
    	Model m11 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m11);
    	Model m12 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m12);
    	Model m13 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m13);
    	Model m14 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m14);
    	Model m15 = new Model("Ik sta achter de huidige koers van onze organisatie.");
    	dataList.add(m15);
    }
}