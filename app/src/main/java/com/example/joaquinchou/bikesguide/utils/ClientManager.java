package com.example.joaquinchou.bikesguide.utils;

import android.util.Log;

import com.inuker.bluetooth.library.BluetoothClient;

/**
 * Created by dingjikerbo on 2016/8/27.
 */
public class ClientManager {

    private static BluetoothClient mClient;

    public static BluetoothClient getClient() {
        if (mClient == null) {
            synchronized (ClientManager.class) {
                if (mClient == null) {
                    if (MyApplication.getInstance() == null) {
                        Log.e("eee","XXXXXXXXXXXX");
                    }
                    mClient = new BluetoothClient(MyApplication.getInstance());
                }
            }
        }
        if (mClient == null) {
            Log.e("RubbishAndroidStudio","XXXXXXXXXXXXX");
        }
        return mClient;
    }
}
