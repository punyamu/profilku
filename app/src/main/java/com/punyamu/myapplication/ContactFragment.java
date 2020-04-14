package com.punyamu.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ContactFragment extends Fragment {
    public static MainActivity mainActivity;

    public static android.app.Fragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new ContactFragment();
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.fragment_contact, container, false);
        return view;
    }
}
