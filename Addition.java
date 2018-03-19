package com.calculator.admin.calc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Addition extends AppCompatActivity {

    private GoogleApiClient client;

   // private static final String TAG = "mymessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        //Log.i(TAG,"onCreate");
    }
    public  void onButtonClick(View v) {

        EditText eta = (EditText) findViewById(R.id.avalue);
        EditText etb = (EditText) findViewById(R.id.bvalue);
        TextView tvr = (TextView) findViewById(R.id.tvresult);
        int num1 = Integer.parseInt(eta.getText().toString());
        int num2 = Integer.parseInt(etb.getText().toString());
        int sum = num1 + num2;
        tvr.setText(Integer.toString(sum));

        //Toast.makeText(Addition.this, "MainActivity", Toast.LENGTH_SHORT).show();
    }
}
