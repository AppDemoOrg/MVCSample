package com.abt.mvc.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

/**
 * @描述： @BaseActivity
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("i am base activity.");
    }

}
