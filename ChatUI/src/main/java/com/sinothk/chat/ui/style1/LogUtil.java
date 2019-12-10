package com.sinothk.chat.ui.style1;

import android.util.Log;


/**
 * 自定义Log
 * @author 90Chris
 */
public class LogUtil {
    public static final String LOG_TAG = "Keyboard:";
    private static boolean enableLogDisplay = true;//true: put on log display in logcat, put off it when release

    private static final int RETURN_NOLOG = 99;

    public static int d(String tag, String msg) {
        return enableLogDisplay ? Log.d(LOG_TAG + tag, msg) : RETURN_NOLOG;
    }

    public static int e(String tag, String msg) {
        return enableLogDisplay ? Log.e(LOG_TAG + tag, msg) : RETURN_NOLOG;
    }

    public static int e(String tag, String msg, Throwable e) {
        return enableLogDisplay ? Log.e(LOG_TAG + tag, msg, e) : RETURN_NOLOG;
    }

    public static int i(String tag, String msg) {
        return enableLogDisplay ? Log.i(LOG_TAG + tag, msg) : RETURN_NOLOG;
    }

    public static int w(String tag, String msg) {
        return enableLogDisplay ? Log.w(LOG_TAG + tag, msg) : RETURN_NOLOG;
    }
}
