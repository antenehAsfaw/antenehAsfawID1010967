package com.anteneh.user_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LogInActivity extends AppCompatActivity {
    SharedPreference sharedPreference ;
    Button LogIn;

    EditText  USERNAME,USERPASS ;
    String username,userpass ;
    Context CTX = this;
EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        LogIn=findViewById(R.id.button4);
        USERNAME=findViewById(R.id.editText9);

        USERPASS=findViewById(R.id.editText10);
        sharedPreference = new SharedPreference(getApplicationContext());
        if(sharedPreference.readLogInStatus())
        {
            Intent intent = new Intent(getApplicationContext(),Information.class);
            startActivity(intent);


        }
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Information.class);
                startActivity(intent);

            }
        });




    }




}
