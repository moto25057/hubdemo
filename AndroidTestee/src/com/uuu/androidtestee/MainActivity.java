package com.uuu.androidtestee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("testee","Viva GIT!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onButton1Click(View view){
		Log.v("testee","button click");
		TextView textView1=(TextView)findViewById(R.id.textView1);
		EditText editText1=(EditText)findViewById(R.id.editText1);
		textView1.setText(editText1.getText().toString());
		Log.v("testee","text view content="+textView1.getText().toString());
		
		
	}

}
