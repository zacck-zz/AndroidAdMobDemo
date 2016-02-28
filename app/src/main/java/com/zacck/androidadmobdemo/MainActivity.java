package com.zacck.androidadmobdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView mAdview = (AdView)findViewById(R.id.mAdView);
        AdRequest mRequest = new AdRequest.Builder().build();
        mAdview.loadAd(mRequest);

    }
}
