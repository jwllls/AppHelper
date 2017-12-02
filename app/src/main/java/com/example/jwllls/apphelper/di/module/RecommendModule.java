package com.example.jwllls.apphelper.di.module;


import android.app.ProgressDialog;

import com.example.jwllls.apphelper.Presenter.contract.RecommendContract;
import com.example.jwllls.apphelper.data.http.ApiService;
import com.example.jwllls.apphelper.data.model.RecommendModel;
import com.example.jwllls.apphelper.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jwllls on 2017/11/19.
 */

@Module
public class RecommendModule {

    private RecommendContract.View mView;

    public RecommendModule(RecommendContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public RecommendContract.View provideView() {
        return mView;
    }

    @Provides
    public RecommendModel provideModel(ApiService apiService) {
        return new RecommendModel(apiService);
    }


    @Provides
    public ProgressDialog providesProgressDialog() {
        return new ProgressDialog(((RecommendFragment) mView).getActivity());
    }


}
