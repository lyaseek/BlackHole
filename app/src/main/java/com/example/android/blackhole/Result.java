package com.example.android.blackhole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        textResult.setText(getIntent().getStringExtra("result"));
        ProgressBar progress = (ProgressBar) findViewById(R.id.progress);
        progress.setProgress(getIntent().getIntExtra("point", 50));
        TextView pr = (TextView) findViewById(R.id.pr);
        pr.setText(getIntent().getIntExtra("point", 50) + "%");
        TextView textAgain = (TextView) findViewById(R.id.textAgain);
        textAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}