package com.punyamu.myapplication;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.FragmentTransaction;


public class SettingFragment extends Fragment {
    Button buttonLogout;

    public static MainActivity mainActivity;

    public static android.app.Fragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new SettingFragment();
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.fragment_setting, container, false);

        buttonLogout = view.findViewById(R.id.btn_logout);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingFragment.mainActivity, LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }
}
