package com.example.waseem.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeLeft();
    }


    public void timeLeft() {
        Date date = new Date();
        TextView text = (TextView) findViewById(R.id.nextPrayerTime);
        text.setText("2 hour, 12 minutes");
        //text.setText(date.toString());
    }

    public void returnAsrTime() {

        Time time = new Time(00, 00, 00);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }
}
