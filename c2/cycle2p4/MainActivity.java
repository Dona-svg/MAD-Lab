package com.example.sjcet.c2p4;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;
    EditText fname;
    EditText lname;
    EditText gender;
    EditText email;
    EditText phone;
    EditText pwd;
    EditText dob;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        gender = findViewById(R.id.gender);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        pwd = findViewById(R.id.pwd);
        email = findViewById(R.id.email);
        register = findViewById(R.id.register);
        dob = findViewById(R.id.dob);

    }

    public void click(View view) {
        SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
        SharedPreferences.Editor editor=mypref.edit();//only write editor
        editor.putString("fname",fname.getText().toString()); //bundle the data
        editor.putString("lname",lname.getText().toString());
        editor.putString("gender",gender.getText().toString());
        editor.putString("email",email.getText().toString());
        editor.putString("phone",phone.getText().toString());
        editor.putString("pwd",pwd.getText().toString());
        //editor.putString("dob",dob.getText().toString());
        editor.commit();
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }
}
