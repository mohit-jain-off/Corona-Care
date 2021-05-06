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


public class CabActivity extends AppCompatActivity {
    Button ola,uber,fast,ntl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab);
        ola=(Button)findViewById(R.id.helpline);
        uber=(Button)findViewById(R.id.Ration);
        fast=(Button)findViewById(R.id.fast);
        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:04433553355"));
                if (ActivityCompat.checkSelfPermission(CabActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CabActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:04461266225"));
                if (ActivityCompat.checkSelfPermission(CabActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CabActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:04460006000"));
                if (ActivityCompat.checkSelfPermission(CabActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CabActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);

                }
                startActivity(callIntent);
            }
        });
    }
}
