package com.punyamu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonProfil, buttonContact, buttonSetting, buttonLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeContent(ProfilFragment.newInstance(this));

        buttonProfil = (Button) findViewById(R.id.btn_profil);
        buttonContact = (Button) findViewById(R.id.btn_contact);
        buttonSetting = (Button) findViewById(R.id.btn_setting);
        buttonLogout = (Button) findViewById(R.id.btn_logout);

        //action
        buttonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ProfilFragment.newInstance(MainActivity.this));
            }
        });
        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ContactFragment.newInstance(MainActivity.this));
            }
        });
        buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(SettingFragment.newInstance(MainActivity.this));
            }
        });
    }


    //memanggil fragment
    public void changeContent(Fragment fragment) {
        getFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commitAllowingStateLoss();
    }
}
