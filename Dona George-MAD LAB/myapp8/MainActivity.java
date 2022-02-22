package com.example.sjcet.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,phno,email,dob;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.editText1);
        lname = findViewById(R.id.editText2);

        email = findViewById(R.id.editText3);
        phno = findViewById(R.id.editText4);

        dob = findViewById(R.id.editText5);
        btn = findViewById(R.id.button);
        sharedpreferences = getSharedPreferences(MyPREFERENCES,
                Context.MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
                SharedPreferences MyPrefs =
                        getSharedPreferences("activity_main2.xml",0);
                SharedPreferences.Editor editor=MyPrefs.edit();
                editor.putString("fname",fname.getText().toString());
                editor.putString("lname",lname.getText().toString());
                editor.putString("phno", phno.getText().toString());

                editor.putString("mail",email.getText().toString());
                editor.putString("dob",dob.getText().toString());

                editor.commit();
                Intent intent = new Intent(getApplicationContext(),
                        Main2activity.class);
                intent.putExtra("fname",fname.getText().toString());
                intent.putExtra("lname",lname.getText().toString());
                intent.putExtra("phno", phno.getText().toString());

                intent.putExtra("mail", email.getText().toString());
                intent.putExtra("dob", dob.getText().toString());

                startActivity(intent);
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) &&
        Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkDataEntered(){
        if (isEmpty(fname)) {

            Toast t = Toast.makeText(this,"You must enter first name to register!", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(fname)) {
            fname.setError("first name is required!");
        }
        if (isEmpty(lname)) {
            lname.setError("Last name is required!");
        }
        if (isEmpty(phno)) {
            phno.setError("mobile number is required!");
        }


        if (isEmpty(dob)) {
            dob.setError("DOB is required!");
        }
        if (isEmail(email) == false) {
            email.setError("Enter valid email!");
        }
    }
}



