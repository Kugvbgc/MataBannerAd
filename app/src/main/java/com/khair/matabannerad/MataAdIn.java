package com.khair.matabannerad;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class MataAdIn extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
    }
}
