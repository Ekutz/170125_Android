package com.jspark.android.activitycontrol;

import android.util.Log;

/**
 * Created by jsPark on 2017. 1. 26..
 * @author jinsooPark
 * @version 1.0
 * @since 170125
 */

public class Logger {
    public final static boolean DEBUG_MODE = true;

    /**
     *
     * @param str 출력하고 싶은 문자열
     * @param className 로거가 발생한 클래스 이름
     */
    public static void print(String str, String className) {
        if(DEBUG_MODE) Log.w(className, str);
    }
}
