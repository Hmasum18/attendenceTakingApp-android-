package com.example.attendenceapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.attendenceapp.R;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private  void init()
    {
        firebaseAuth = FirebaseAuth.getInstance();
    }
}
