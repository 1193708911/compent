package com.example.administrator.myapplication;


import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mylibrary.base.BaseApp;

/**
 * Created by Administrator on 2018/8/8.
 */

public class MainApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
