package com.example.coronanew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button stats,helpline,hospital,medical,chatbot,dos,news,faq,covid,cab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        if (ActivityCompat.checkSelfPermission(MenuActivity.this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MenuActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }

        stats=(Button)findViewById(R.id.stats);
        covid=(Button)findViewById(R.id.covid);
        helpline=(Button)findViewById(R.id.helpline);
        hospital=(Button)findViewById(R.id.hospital);
        chatbot=(Button)findViewById(R.id.chatbot);
        medical=(Button)findViewById(R.id.medical);
        faq=(Button)findViewById(R.id.faq);
        dos=(Button)findViewById(R.id.dos);
        news=(Button)findViewById(R.id.news);
        cab=(Button)findViewById(R.id.cab);
        cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,CabActivity.class);
                startActivity(i);
            }
        });
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,MapHospiatlsActivity.class);
                startActivity(i);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,FaqActivity.class);
                startActivity(i);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,NewsActivity.class);
                startActivity(i);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,dosanddontsActivity.class);
                startActivity(i);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,StatsMainActivity.class);
                startActivity(i);
            }
        });
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,MedicalActivity.class);
                startActivity(i);
            }
        });
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,ChatbotActivity.class);
                startActivity(i);
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MenuActivity.this,HospitalMainActivity.class);
                startActivity(i);
            }
        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MenuActivity.this,HelplineActivity.class);
                startActivity(i);
            }
        });
    }
}
