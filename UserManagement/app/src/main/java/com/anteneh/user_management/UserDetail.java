package com.anteneh.user_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserDetail extends AppCompatActivity {
 TextView t2,t3,t4,t5,t6,t7;
 Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);
        t6=findViewById(R.id.textView6);
        t7=findViewById(R.id.textView7);
        button =findViewById(R.id.logout2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserDetail.this,MainActivity.class));
            }
        });
        String[] data=getIntent().getStringArrayExtra("user");
        t2.setText(data[0]);
        t3.setText(data[1]);
        t4.setText(data[2]);
        t5.setText(data[3]);
        t6.setText(data[4]);
        t7.setText(data[5]);
    }




}
