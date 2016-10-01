package com.example.cc15.soco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPassword;
    private String et_username;
    private String et_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_login_activity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


       // final TextView textViewUsername = (TextView) findViewById(R.id.textview_username);
        //textViewUsername.setVisibility(View.INVISIBLE);

        //final TextView textViewPassword = (TextView) findViewById(R.id.textview_password);
        //textViewPassword.setVisibility(View.INVISIBLE);

        /*editTextUsername = (EditText) findViewById(R.id.edittext_username);

        editTextUsername.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    textViewUsername.setVisibility(View.VISIBLE);
                } else {
                    textViewUsername.setVisibility(View.INVISIBLE);
                }
            }
        });

        editTextPassword = (EditText) findViewById(R.id.edittext_password);
//        et_pass = editTextPassword.getText().toString();
        editTextPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    textViewPassword.setVisibility(View.VISIBLE);
                } else {
                    textViewPassword.setVisibility(View.INVISIBLE);
                }

            }
        });
*/
        Button btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_username = editTextUsername.getText().toString();
                et_pass = editTextPassword.getText().toString();
                Log.i("LoginActivity", et_username + " " + et_pass);
                //Start AsyncTaskLogin, if successful start HomeActivity else Show dilaog to try again or any other error
                if (et_username.length() < 1 || et_pass.length() < 1) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(login_activity.this);
                    builder1.setMessage("Please fill the data");
                    builder1.setCancelable(true);

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                }
                //   new AsyncTaskLogin(login_activity.this).execute(et_username, et_pass);


            }
        });

        TextView textViewSignUp = (TextView) findViewById(R.id.textview_signup);
        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent j = new Intent(login_activity.this,SignUpActivity.class);
                startActivity(j);
            }
        });


        // Check for internet connection


    }
}