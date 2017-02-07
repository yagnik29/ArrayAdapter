package com.example.yash.arrayadapter;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment blankFragment = new BlankFragment();

        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.activity_main,blankFragment);
        ft.commit();
    }
}
