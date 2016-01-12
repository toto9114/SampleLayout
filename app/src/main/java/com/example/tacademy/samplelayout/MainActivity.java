package com.example.tacademy.samplelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_linear);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intent);
            }
        });

        btn = (Button)findViewById(R.id.btn_relative);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intetnt);
            }
        });
        btn = (Button)findViewById(R.id.btn_frame);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intetnt);
            }
        });
    }
}
