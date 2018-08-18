package com.example.joaquinchou.bikesguide.utils;

import android.widget.Toast;

/**
 * Created by dingjikerbo on 2016/9/6.
 */
public class CommonUtils {

    public static void toast(String text) {
        Toast.makeText(MyApplication.getInstance(), text, Toast.LENGTH_SHORT).show();
    }
}
