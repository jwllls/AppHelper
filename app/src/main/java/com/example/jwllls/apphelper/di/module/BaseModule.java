package com.example.jwllls.apphelper.di.module;

import com.example.jwllls.apphelper.ui.base.BaseApplication;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jwllls on 2017/11/26.
 */
@Module
public class BaseModule {

    private BaseApplication mBaseModule;

    public BaseModule(BaseApplication mBaseModule) {
        this.mBaseModule = mBaseModule;
    }

    @Provides
    @Singleton
    public BaseApplication provideBaseApplication(){
        return mBaseModule;
    }

    @Provides
    @Singleton
    public Gson provideGson(){
        return new Gson();
    }

}
