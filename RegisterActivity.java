package com.wintwin.admin.bas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button btnregister, btnlogin;
    private String etname, etemail, etpassword, etconfirm, etphone;
    private EditText name, mail, password, cpassword, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.etname);

        mail = (EditText) findViewById(R.id.etemail);
        password = (EditText) findViewById(R.id.etpassword);
        cpassword = (EditText) findViewById(R.id.etconfirm);
        phone = (EditText) findViewById(R.id.etphone);
        btnregister = (Button) findViewById(R.id.btnregister);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    public void register() {

        intialize();
        if (!validate()) {

            onRegisterFailed();

        } else {
            onRegisterSuccess();
        }
    }

    public void onRegisterFailed() {

        Toast.makeText(this, "Register has Failled", Toast.LENGTH_SHORT).show();
    }

    public void onRegisterSuccess() {

        Toast.makeText(this, "Register Successfully!", Toast.LENGTH_SHORT).show();

    }

    public boolean validate() {
        boolean valid = true;
        if (etname.isEmpty() || etname.length() > 30) {
            name.setError("Pls Enter Valid Name");
            valid = false;
        }
        if (etemail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(etemail).matches()) {
            mail.setError("Pls Enter Valid Mail id");
            valid = false;
        }
     /*  if(etphone.isEmpty(){
            phone.setError("Pls Enter Vaild Phone No");
            valid = false;
        }*/
        return valid;
    }

    public void intialize() {

        etname = name.getText().toString();
        etemail = mail.getText().toString();
        etpassword = password.getText().toString();
        etconfirm = cpassword.getText().toString();
        etphone = phone.getText().toString().trim();


    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.btnak) {

            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
