package com.example.androidteamproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Option extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        Button bt4 = (Button)findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Option.this, Add1.class);
                startActivity(intent);
            }
        });

        Button bt5 = (Button)findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Option.this, Add2.class);
                startActivity(intent);
            }
        });

        Button bt6 = (Button)findViewById(R.id.button6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Option.this, Check_Add.class);
                startActivity(intent);
            }
        });

        Button bt7 = (Button)findViewById(R.id.button7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Option.this, Sound.class);
                startActivity(intent);
            }
        });

        Button bt8 = (Button)findViewById(R.id.button8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Option.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}