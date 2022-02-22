package com.example.sjcet.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";
    EditText txt1,txt2,txt3,txt4;
    TextView txtv1,txtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1=findViewById(R.id.ed4);
        txt2=findViewById(R.id.ed5);
        txt3=findViewById(R.id.ed6);
        txt4=findViewById(R.id.pwd);
        txtv1=findViewById(R.id.tv1);
        txtv2=findViewById(R.id.tv2);
    }

    public void register(View view) {
        if(txt1.getText().toString().isEmpty()){
            txtv1.setText("Please Enter a Name");
        }
        else{

            if(txt2.getText().toString().isEmpty()){
                txtv2.setText(" please Enter an email id");
            }
            else {
                if (txtv2.getText().toString().trim().matches(emailPattern)) {
                    Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                    startActivity(intent);
                } else
                {
                    txtv2.setText("Please Enter a Valid Email id");
                }

            }
        }

    }
}