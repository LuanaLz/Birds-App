package com.social.birds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import start_app.sc_choose_user;
import start_app.sc_terms_of_use;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_choose_user()).commit();
            //getSupportFragmentManager().beginTransaction().replace(R.id.frameBottom, new sc_terms_of_use()).commit();
        }
    }
}