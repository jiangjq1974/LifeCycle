package com.jjq.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class SecondActivity extends AppCompatActivity {
    private TextView text;
    private Button mButton;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String data = intent.getStringExtra(MainActivity.DATA);
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();
        text = (TextView) findViewById(R.id.activity_second_textview);
        text.setText(data);
        mButton = (Button) findViewById(R.id.activity_second_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText = (EditText) findViewById(R.id.activity_second_edit_text);
                Intent intent=new Intent();
                intent.putExtra("back", mEditText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
