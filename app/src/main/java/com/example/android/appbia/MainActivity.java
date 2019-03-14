package com.example.android.appbia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDescriptografar(View vier) {
        Intent i = new Intent(this, Descriptografar.class);
        startActivity(i);
    }

    public void abrirCriptografar(View vier) {
        Intent i = new Intent(this, Criptografar.class);
        startActivity(i);
    }


}