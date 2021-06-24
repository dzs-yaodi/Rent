package com.xw.rent;

import android.app.Application;

import com.xw.baselib.http.HttpManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        HttpManager.getInstance().init("");
    }
}
