package com.thanhtam.intentimplicit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBrowser , btnSendMes , btnDial, btncontact, btnsend, btnViewWifi, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBrowser = (Button)findViewById(R.id.buttonBrowser);
        btnSendMes = (Button)findViewById(R.id.buttonSendMes);
        btnDial = (Button)findViewById(R.id.buttonDial);
        btncontact = (Button)findViewById(R.id.buttoncontact);
        btnsend = (Button)findViewById(R.id.buttonSend);
        btnViewWifi = (Button)findViewById(R.id.buttonViewSettingWifi);
        btnCall = (Button)findViewById(R.id.buttonCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0494894949"));
                startActivity(intent);
            }
        });

        btnViewWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_WIFI_SETTINGS);
                startActivity(intent);
            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Noi dung tin nhan");
                startActivity(intent);
            }
        });

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people/"));
                startActivity(intent);
            }
        });
        btnSendMes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("sms: 94309093"));
                intent.putExtra("sms_body", "Noi dung tin nhan");
                startActivity(intent);    }
        });

         btnDial.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent();
                 intent.setAction(Intent.ACTION_DIAL);
                 intent.setData(Uri.parse("tel:6723423423"));
                 startActivity(intent);
             }
         });

         btnBrowser.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent();
                 intent.setAction(Intent.ACTION_VIEW);
                 intent.setData(Uri.parse("http://khoapham.vn/"));
                 startActivity(intent);

             }
         });


    }
}
