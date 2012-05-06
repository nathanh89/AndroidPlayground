package com.Android.FirstSteps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void informationClickHandler(View view) {
    	if (view.getId() == R.id.getInfo){
    		setContentView(R.layout.infoscreen);
    	}
    }
}