package com.example.joaquinchou.bikesguide.utils;

import android.app.Activity;
import android.os.Bundle;

import com.example.joaquinchou.bikesguide.R;
import com.inuker.bluetooth.library.utils.BluetoothLog;

/**
 * Created by liwentian on 2017/3/9.
 */

public class TestActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        BluetoothLog.v(String.format("%s onCreate", this.getClass().getSimpleName()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        BluetoothLog.v(String.format("%s onResume", this.getClass().getSimpleName()));
    }



    @Override
    protected void onStart() {
        super.onStart();
        BluetoothLog.v(String.format("%s onStart", this.getClass().getSimpleName()));
    }
}
