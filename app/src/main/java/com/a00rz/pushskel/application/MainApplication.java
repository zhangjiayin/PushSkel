package com.a00rz.pushskel.application;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by jiayin on 17-1-9.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        com.a00rz.push.Initializer initializer = new com.a00rz.push.Initializer();
        initializer.initCloudChannel(this);
    }
}

