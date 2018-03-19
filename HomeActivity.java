package com.wintwin.admin.bas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton button1 = (ImageButton) findViewById(R.id.btn1);
        ImageButton button2 = (ImageButton) findViewById(R.id.btn2);
        ImageButton button3 = (ImageButton) findViewById(R.id.btn3);
        ImageButton button4 = (ImageButton) findViewById(R.id.btn4);
        ImageButton button5 = (ImageButton) findViewById(R.id.btn5);
        ImageButton button6 = (ImageButton) findViewById(R.id.btn6);
        ImageButton button7 = (ImageButton) findViewById(R.id.btn7);
        ImageButton button8 = (ImageButton) findViewById(R.id.btn8);
        ImageButton button9 = (ImageButton) findViewById(R.id.btn9);
        ImageButton button10 = (ImageButton) findViewById(R.id.btn10);
        ImageButton button11 = (ImageButton) findViewById(R.id.btn11);
        ImageButton button12 = (ImageButton) findViewById(R.id.btn12);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn1:
                Intent bci = new Intent(HomeActivity.this, Service1.class);
                startActivity(bci);

            case R.id.btn2:
                Intent brs = new Intent(HomeActivity.this, Service1.class);
                startActivity(brs);
            case R.id.btn3:
                Intent hc = new Intent(HomeActivity.this, Service1.class);
                startActivity(hc);
            case R.id.btn4:
                Intent agu = new Intent(HomeActivity.this, Service1.class);
                startActivity(agu);
            case R.id.btn5:
                Intent kotak = new Intent(HomeActivity.this, Service1.class);
                startActivity(kotak);
            case R.id.btn6:
                Intent ecom = new Intent(HomeActivity.this, Service1.class);
                startActivity(ecom);
            case R.id.btn7:
                Intent yocoin = new Intent(HomeActivity.this, Service1.class);
                startActivity(yocoin);
            case R.id.btn8:
                Intent project = new Intent(HomeActivity.this, Service1.class);
                startActivity(project);
            case R.id.btn9:
                Intent jobs = new Intent(HomeActivity.this, Service1.class);
                startActivity(jobs);
            case R.id.btn10:
                Intent jeeva = new Intent(HomeActivity.this, Service1.class);
                startActivity(jeeva);
            case R.id.btn11:
                Intent gmcks = new Intent(HomeActivity.this, Service1.class);
                startActivity(gmcks);
            case R.id.btn12:
                Intent sri = new Intent(HomeActivity.this, Service1.class);
                startActivity(sri);
        }

    }}

  /*  @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.calculator.admin.firstapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.calculator.admin.firstapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}*/
