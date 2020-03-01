package com.anteneh.user_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button LogIn,Register;
int status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogIn = findViewById(R.id.button);
        Register=findViewById(R.id.button2);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               status = 1;
                Bundle b = new Bundle();
                b.putInt("status",status);
                Intent intent = new Intent  (MainActivity.this,LogInActivity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //status =2;
//                b.putInt("status",status);
                Intent intent= new Intent(MainActivity.this,RegisterActivity.class);
                //intent.putExtras(b);
                startActivity(intent);
            }
        });

    }





    }

