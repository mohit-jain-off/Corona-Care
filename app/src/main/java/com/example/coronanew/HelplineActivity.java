package com.example.coronanew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelplineActivity extends AppCompatActivity {


    Button police,ambul,help,ration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        police=(Button)findViewById(R.id.police);
        ambul=(Button)findViewById(R.id.Ambulance);
        help=(Button)findViewById(R.id.helpline);
        ration=(Button)findViewById(R.id.Ration);
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:100"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(HelplineActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
        ambul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:108"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(HelplineActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:1075"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(HelplineActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:1967"));
                if (ActivityCompat.checkSelfPermission(HelplineActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(HelplineActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
    }
}
