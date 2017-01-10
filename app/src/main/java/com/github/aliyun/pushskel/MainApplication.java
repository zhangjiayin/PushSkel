package com.github.aliyun.pushskel;

import android.app.Application;

import com.github.aliyun.push.Initializer;


/**
 * Created by jiayin on 17-1-10.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Initializer initializer = new Initializer();
        initializer.initCloudChannel(this);
    }
}
