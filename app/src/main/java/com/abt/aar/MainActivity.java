package com.abt.aar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abt.library.Lib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lib.print();

    }
}
