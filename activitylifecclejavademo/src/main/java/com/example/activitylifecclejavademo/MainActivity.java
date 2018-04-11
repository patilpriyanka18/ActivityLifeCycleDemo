package com.example.activitylifecclejavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mt("OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mt("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mt("onResume");
    }

    @Override
    protected void onPause() {
        mt("onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        mt("OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mt("OnDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mt("OnRestart");
    }
    private void mt(String msg){
        Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
    }

}
