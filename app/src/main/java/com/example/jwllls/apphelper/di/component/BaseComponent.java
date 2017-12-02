package com.example.jwllls.apphelper.di.component;

import com.example.jwllls.apphelper.data.http.ApiService;
import com.example.jwllls.apphelper.di.module.BaseModule;
import com.example.jwllls.apphelper.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jwllls on 2017/11/26.
 */

@Singleton
@Component(modules = {BaseModule.class, HttpModule.class})
public interface BaseComponent {

    public ApiService getApiService();

}
