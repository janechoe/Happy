package com.example.janechoe.happy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

public class AboutActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about);
        FrameLayout aboutinflator = (FrameLayout)(findViewById(R.id.content_frame));
        getLayoutInflater().inflate(R.layout.activity_about, aboutinflator);


        //DOESN'T WORK
//        View view= getLayoutInflater().inflate(R.layout.activity_about, aboutinflator);
//        setContentView(view);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }
}
