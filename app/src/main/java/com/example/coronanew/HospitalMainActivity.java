package com.example.coronanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalMainActivity extends AppCompatActivity {
Button apollo,mfine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_main);
        apollo=(Button)findViewById(R.id.apollo);
        mfine=(Button)findViewById(R.id.mfine);
        apollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(HospitalMainActivity.this,ApolloActivity.class);
                startActivity(i);
            }
        });
        mfine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HospitalMainActivity.this,HospitalActivity.class);
                startActivity(i);
            }
        });
    }
}
