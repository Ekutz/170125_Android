package com.jspark.android.activitycontrol;

import android.util.Log;

/**
 * Created by jsPark on 2017. 1. 26..
 */

public class Logger {
    public final static boolean DEBUG_MODE = true;//BuildConfig.DEBUG;

    public static void print(String str, String className) {
        if(DEBUG_MODE) Log.d(className, str);
    }
}
