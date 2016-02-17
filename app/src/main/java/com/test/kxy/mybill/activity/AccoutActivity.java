package com.test.kxy.mybill.activity;

import android.app.Activity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.test.kxy.mybill.R;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by zzx on 2016/2/17.
 */
public class AccoutActivity extends Activity {
    private EditText ed_date_timer;
    private Calendar cal;
    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        ed_date_timer = (EditText) findViewById(R.id.ed_data_timer);
        ed_date_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal = Calendar.getInstance(Locale.CHINA);
                Date myDate = new Date();
                cal.setTime(myDate);
                year = cal.get(Calendar.YEAR);
                month = cal.get(Calendar.MONTH);
                day = cal.get(Calendar.DAY_OF_MONTH);
                new DatePickerDialog(AccoutActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        String str = i + i1 + i2 + "";
                        ed_date_timer.setText(str);
                    }
                },year,month,day).show();
            }
        });

    }

}
