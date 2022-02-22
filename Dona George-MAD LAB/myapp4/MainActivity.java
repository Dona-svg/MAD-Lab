package com.example.sjcet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1,btn2;
    String Username = "admin";
    String Password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById((R.id.ed1));
        txt2=findViewById(R.id.ed2);
        btn1=findViewById(R.id.button1);
    }

    public void login(View view) {
        String username = txt1.getText().toString();
        String password = txt2.getText().toString();
        if(username.equals(Username) && password.equals(Password)){

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }

        else{
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);

    }
}
