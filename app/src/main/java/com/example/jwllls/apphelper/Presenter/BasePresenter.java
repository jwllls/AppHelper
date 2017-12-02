package com.example.jwllls.apphelper.Presenter;

import com.example.jwllls.apphelper.ui.BaseView;

/**
 * Created by jwllls on 2017/11/7.
 */

public class BasePresenter<M, V extends BaseView> {

    protected M mModel;
    protected V mView;

    public BasePresenter(M mModel, V mView) {
        this.mModel = mModel;
        this.mView = mView;
    }

//    void onStart();
//
//    void onStop();
}
