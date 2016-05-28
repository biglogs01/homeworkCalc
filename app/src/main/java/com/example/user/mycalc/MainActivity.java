package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText fEt;
    EditText sEt;

    Button plus;
    Button minus;
    Button multi;
    Button division;
    Button rest;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fEt = (EditText) findViewById(R.id.firstEt);
        sEt = (EditText) findViewById(R.id.secondEt);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multi = (Button) findViewById(R.id.minus);
        division = (Button) findViewById(R.id.division);
        rest = (Button) findViewById(R.id.rest);

        tv = (TextView) findViewById(R.id.result);

        plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tv.setText( Integer.parseInt(fEt.getText().toString()) + Integer.parseInt(sEt.getText().toString()) );
                return false;
            }
        });


    }
}
