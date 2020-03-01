package com.anteneh.user_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {


EditText FIRST_NAME,SECOND_NAME,LAST_NAME,MOBILE,
         GENDER,USER_NAME,EMAIL,USER_PASS,CON_PASS;

String   first_name,second_name,last_name,mobile,
         gender,user_name,email,user_pass,con_pass;

Button REG;

Context ctx=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        FIRST_NAME=findViewById(R.id.editText);
        SECOND_NAME=findViewById(R.id.editText4);
        LAST_NAME=findViewById(R.id.editText5);
        MOBILE=findViewById(R.id.editText2);

        GENDER=findViewById(R.id.editText3);
        USER_NAME=findViewById(R.id.editText8);
        EMAIL=findViewById(R.id.editText6);
        USER_PASS=findViewById(R.id.editText7);
        CON_PASS=findViewById(R.id.editText11);
        REG=findViewById(R.id.button3);


        REG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                first_name=FIRST_NAME.getText().toString();
                second_name=SECOND_NAME.getText().toString();
                last_name=LAST_NAME.getText().toString();
                mobile=MOBILE.getText().toString();

                gender=GENDER.getText().toString();
                user_name=USER_NAME.getText().toString();
                email=EMAIL.getText().toString();
                user_pass=USER_PASS.getText().toString();
                con_pass=CON_PASS.getText().toString();

                if(!(user_pass.equals(con_pass)))
                {

                    Toast.makeText(getBaseContext(),"Password are not matching",Toast.LENGTH_LONG).show();
                   USER_NAME.setText("");
                   USER_PASS.setText("");
                   CON_PASS.setText("");
                    finish();
                }
                else
                {


                    DatabaseOperations DB= new DatabaseOperations(ctx);
                    DB.putInformation(DB,first_name,second_name,last_name,mobile,
                            gender,user_name,email,user_pass);
                    Toast.makeText(getBaseContext(),"Registration Succes",Toast.LENGTH_LONG).show();
                    finish();

                }



            }
        });


    }
}
