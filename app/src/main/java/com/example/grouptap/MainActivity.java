package com.example.grouptap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textViewFragment;
    Button buttonFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         buttonFragment = setContentTransitionManager(R.id.button);
         textViewFragment = setContentView(R.id.textView);


    }
}
