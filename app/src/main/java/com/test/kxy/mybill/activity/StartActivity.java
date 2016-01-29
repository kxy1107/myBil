package com.test.kxy.mybill.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.test.kxy.mybill.R;



public class StartActivity extends Activity {

    private final long WAITTIMER = 2000;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = StartActivity.this.getSharedPreferences("share",MODE_PRIVATE);
                boolean isFirstRun = sharedPreferences.getBoolean("isFirstRun", true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(isFirstRun){
                    editor.putBoolean("isFirstRun", false);
                    editor.commit();
                    Intent intent = new Intent(StartActivity.this,ViewPagerActivity.class);
                    startActivity(intent);

                }else{
                    Intent intent = new Intent(StartActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        },WAITTIMER);



    }

}
