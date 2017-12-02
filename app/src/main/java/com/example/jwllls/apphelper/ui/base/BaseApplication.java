package com.example.jwllls.apphelper.ui.base;

import android.app.Application;
import android.content.Context;

import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.di.component.DaggerBaseComponent;
import com.example.jwllls.apphelper.di.module.BaseModule;
import com.example.jwllls.apphelper.di.module.HttpModule;


/**
 * Created by jwllls on 2017/10/22.
 */

public class BaseApplication extends Application {


    public  BaseComponent mBaseComponent;

    public static BaseApplication get(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

    public  BaseComponent getmBaseComponent() {
        return mBaseComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseComponent = DaggerBaseComponent.builder()
                .baseModule(new BaseModule(this))
                .httpModule(new HttpModule())
                .build();
    }
}
