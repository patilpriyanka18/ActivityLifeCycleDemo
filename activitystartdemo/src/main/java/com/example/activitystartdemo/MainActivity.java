package com.example.activitystartdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok=(Button)findViewById(R.id.btnOk);
        SampleClass sp=new SampleClass();
        sp.display();

    }

    @Override
    protected void onStart() {
        super.onStart();
        mt("Start Activity");
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
        super.onStop();
        mt("Stop Activity");
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
