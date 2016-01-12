package com.example.tacademy.samplelayout;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {

    ImageView dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        dialogView = (ImageView)findViewById(R.id.dialog_view);
        ImageView btnView = (ImageView)findViewById(R.id.image_small);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dialogView.getVisibility() == View.GONE){
                    dialogView.setVisibility(View.VISIBLE);
                }
                else
                    dialogView.setVisibility(View.GONE);
            }
        });

        dialogView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView.setVisibility(View.GONE);
            }
        });
    }
}
