package com.example.jwllls.apphelper.data.model;


import com.example.jwllls.apphelper.data.bean.AppInfo;
import com.example.jwllls.apphelper.data.bean.PageBean;
import com.example.jwllls.apphelper.data.http.ApiService;

import rx.Observable;

/**
 * Created by jwllls on 2017/11/27.
 */

public class RecommendModel {

    private ApiService mApiService;

    public RecommendModel(ApiService mApiService) {
        this.mApiService = mApiService;
    }

    public Observable<PageBean<AppInfo>> getApps() {
        return mApiService.getApps("{'page':0}");
    }
}
