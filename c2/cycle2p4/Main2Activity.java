package com.example.sjcet.c2p4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.SharedPreferences;

public class Main2Activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                TextView fname,lname,gender,email,phone,pwd,dob;
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);
                fname=findViewById(R.id.fname);
                lname=findViewById(R.id.lname);
                gender=findViewById(R.id.gender);
                email=findViewById(R.id.email);
                phone=findViewById(R.id.phone);
                pwd=findViewById(R.id.pwd);
                dob=findViewById(R.id.dob);
                Intent intent = getIntent();
                //String str = intent.getStringExtra("Message_Key");
                // display the string into textView
                SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);//&quot;myprefsfile&quot; is filename
                String fn=mypref.getString("fname",null);
                String ln=mypref.getString("lname",null);
                String ge=mypref.getString("gender",null);
                String em=mypref.getString("email",null);
                String ph=mypref.getString("phone",null);
                String pass=mypref.getString("pwd",null);
                String db=mypref.getString("dob",null);
                fname.setText(fn);
                lname.setText(ln);
                gender.setText(ge);
                email.setText(em);
                phone.setText(ph);
                pwd.setText(pass);
                dob.setText(db);
        }
}