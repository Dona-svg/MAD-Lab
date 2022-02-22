package com.example.sjcet.myapplication;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt = findViewById(R.id.bt);
    }

    public void back(View view) {
        OpenNewActivity();
    }

    public void OpenNewActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
