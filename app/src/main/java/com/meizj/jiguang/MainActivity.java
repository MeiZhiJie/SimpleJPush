package com.meizj.jiguang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerMessageReceiver();  // used for receive msg
    }

    public void registerMessageReceiver() {
//        JPushInterface.setDebugMode(true);
        JPushInterface.init(getApplicationContext());
    }
}
