package com.example.coronanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CovidMainActivity extends AppCompatActivity {

    Button map,priv,gov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_main);
        map=(Button)findViewById(R.id.helpline);
        priv=(Button)findViewById(R.id.Ambulance);
        gov=(Button)findViewById(R.id.Ration);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CovidMainActivity.this,MapHospiatlsActivity.class);
                startActivity(i);
            }
        });
        priv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CovidMainActivity.this,PrivHospActivity.class);
                startActivity(i);
            }
        });
        gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CovidMainActivity.this,GovthospActivity.class);
                startActivity(i);
            }
        });
    }
}
