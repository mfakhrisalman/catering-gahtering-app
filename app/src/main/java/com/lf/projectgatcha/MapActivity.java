package com.lf.projectgatcha;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        Fragment fragment =new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }

}