package com.abt.mvc;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @描述： @MVCApplication
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class MVCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
