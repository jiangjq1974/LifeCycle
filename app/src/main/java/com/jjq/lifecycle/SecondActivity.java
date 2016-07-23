package com.jjq.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class SecondActivity extends AppCompatActivity{
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String data=intent.getStringExtra(MainActivity.DATA);
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();
        text = (TextView) findViewById(R.id.activity_second_textview);
        text.setText(data);
    }
}
