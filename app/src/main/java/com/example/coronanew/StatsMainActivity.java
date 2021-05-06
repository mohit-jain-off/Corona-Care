package com.example.coronanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatsMainActivity extends AppCompatActivity {
Button ind,inter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_main);
        ind=(Button)findViewById(R.id.india);
        inter=(Button)findViewById(R.id.international);
        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StatsMainActivity.this,StatsActivity.class);
                startActivity(i);
            }
        });
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StatsMainActivity.this,InternationalActivity.class);
                startActivity(i);
            }
        });
    }
}
