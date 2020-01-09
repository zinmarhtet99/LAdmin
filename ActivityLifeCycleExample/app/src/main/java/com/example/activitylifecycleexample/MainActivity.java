package com.example.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private  static String HOME_ACTIVITY_TAG=MainActivity.class.getSimpleName();
    private  void showLog(String text){
        Log.d(HOME_ACTIVITY_TAG,text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLog("Activity Created");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("Activity Restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity Destoryed");
    }
}
