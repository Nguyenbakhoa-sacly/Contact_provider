package com.example.contentprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CONTACTS_ASK_PERMISSIONS= 1001;
    private static final int REQUEST_SMS_ASK_PERMISSIONS=1002;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button1);
        addEvents();

    }
    private void addEvents() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyManHinhDanhBa();
            }
        });
    }

    private void XuLyManHinhDanhBa() {
        Intent intent=new Intent(MainActivity.this,DanhBa.class);
        intent.setClassName("com.example.contentprovider","com.example.contentprovider.DanhBa");
        startActivity(intent);
    }
}