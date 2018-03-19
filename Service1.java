package com.wintwin.admin.bas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View.OnClickListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class Service1 extends AppCompatActivity {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    //implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service1);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myadAdapter = new ArrayAdapter<String>(Service1.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myadAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadAdapter);

        //  findViewById(R.id.btnsubmit).setOnClickListener(this);
        final Button send = (Button) this.findViewById(R.id.btnsubmit);
        send.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                try {
                    GMailSender sender = new GMailSender("aboorva006@gmail.com", "thinkpositive");
                    sender.sendMail("This is subject", "This is Body", "pta@wintwintechnologies.com");
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void clickexit(View v) {

        moveTaskToBack(true);
        Process.killProcess(Process.myPid());
        System.exit(1);


    }


    /*  public  void onClick(View view) {
           String phoneNumber = ((EditText)findViewById(R.id.etphone)).getText().toString();
           try {
                 SmsManager.getDefault().sendTextMessage(phoneNumber, null, "Hello SMS!", null, null);
           } catch (Exception e) {

               AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
               AlertDialog dialog = alertDialogBuilder.create();
               dialog.setMessage(e.getMessage());
               dialog.show();



           }}*/
    public void onButtonClick(View view) {
        if (view.getId() == R.id.btnsubmit) {
            Intent intent = new Intent(Service1.this, EndActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Service1 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.wintwin.admin.bas/http/host/path")
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
                "Service1 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.wintwin.admin.bas/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
