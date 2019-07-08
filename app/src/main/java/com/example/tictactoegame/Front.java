package com.example.tictactoegame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Front extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        Handler a=new Handler();
        a.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Front.this,MainActivity.class);
                startActivity(i);
                finish();


            }
        },2000);

    }
}
