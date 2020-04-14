package com.punyamu.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.punyamu.myapplication.MainActivity;


public class ProfilFragment extends Fragment {
    public static MainActivity mainActivity;

    public static android.app.Fragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new com.punyamu.myapplication;.ProfilFragment();
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.fragment_profil, container, false);
        return view;
    }
}
