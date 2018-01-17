package com.example.alienwarem14xr2.luckydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
    }

    public void drawNextNumber (View v){
        int lucky = r.nextInt(100) + 1; //not start from 0
        TextView textViewLucyNumber = (TextView) findViewById(R.id.luckyNumber);
        textViewLucyNumber.setText(String.valueOf(lucky));
    }
}
