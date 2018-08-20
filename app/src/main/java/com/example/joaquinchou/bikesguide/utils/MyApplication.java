package com.example.joaquinchou.bikesguide.utils;

import android.app.Application;

import com.inuker.bluetooth.library.BluetoothContext;

/**
 * Created by dingjikerbo on 2016/8/27.
 */
public class MyApplication extends Application {

    private static MyApplication instance;
    private String _angle = "0000";

    public String get_angle() {
        return _angle;
    }

    public void set_angle(String s) {
        _angle = s;
    }

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        BluetoothContext.set(this);

    }
}
