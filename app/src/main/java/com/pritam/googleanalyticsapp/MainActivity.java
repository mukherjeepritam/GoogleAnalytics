package com.pritam.googleanalyticsapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends Activity {

    private static GoogleAnalytics sAnalytics;
    private static Tracker sTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sAnalytics = GoogleAnalytics.getInstance(this);
        sAnalytics.setLocalDispatchPeriod(1800);

        sTracker = sAnalytics.newTracker("UA-119402655-1");
        sTracker.enableAdvertisingIdCollection(true);
        sTracker.enableExceptionReporting(true);
        sTracker.enableAutoActivityTracking(true);

    }
}
