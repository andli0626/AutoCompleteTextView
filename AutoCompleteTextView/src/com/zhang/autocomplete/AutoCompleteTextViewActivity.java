package com.zhang.autocomplete;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends Activity {
    /** Called when the activity is first created. */
	private AutoCompleteTextView actv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String[] s=new String[]{"常熟老晨曲","老人","常熟老街","查了那个老"};
        
        actv=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        
        com.zhang.autocomplete.ArrayAdapter<String> adapter=new com.zhang.autocomplete.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,s);
       
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }
}