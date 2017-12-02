package com.example.jwllls.apphelper.data.model;

import com.example.jwllls.apphelper.data.http.ApiService;

import okhttp3.Callback;

/**
 * Created by jwllls on 2017/11/27.
 */

public class RecommendModel {

    private ApiService mApiService;

    public RecommendModel(ApiService mApiService) {
        this.mApiService = mApiService;
    }

    public void getApps(Callback jsonPrama) {
        mApiService.getApps("");
    }
}
