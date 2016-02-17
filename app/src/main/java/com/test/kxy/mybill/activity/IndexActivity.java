package com.test.kxy.mybill.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.kxy.mybill.R;

/**
 * Created by kxy on 2016/2/17.
 */
public class IndexActivity extends Activity implements View.OnClickListener {

    private Button btn_add_consumer_records;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        btn_add_consumer_records = (Button) findViewById(R.id.btn_add_consumer_records);
        btn_add_consumer_records.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(IndexActivity.this,AccoutActivity.class);
        startActivity(intent);
    }
}
