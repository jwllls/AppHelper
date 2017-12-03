package com.example.jwllls.apphelper.Presenter;

import android.util.Log;

import com.example.jwllls.apphelper.Presenter.contract.RecommendContract;
import com.example.jwllls.apphelper.data.bean.AppInfo;
import com.example.jwllls.apphelper.data.bean.PageBean;
import com.example.jwllls.apphelper.data.model.RecommendModel;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jwllls on 2017/11/7.
 */

public class RecommendPresenter extends BasePresenter<RecommendModel, RecommendContract.View> implements RecommendContract.Presenter {

    @Inject
    public RecommendPresenter(RecommendModel mModel, RecommendContract.View vView) {
        super(mModel, vView);
    }

    @Override
    public void getData() {


        mModel.getApps()
                .subscribeOn(Schedulers.io()) //背观察者在IO线程中进行网络请求

                .observeOn(AndroidSchedulers.mainThread())  //观察者在主线程中更新UI

                .subscribe(new Subscriber<PageBean<AppInfo>>() {


                    @Override
                    public void onStart() {
                        mView.showLoading(); //在订阅之前
                    }

                    @Override
                    public void onCompleted() {
                        mView.dismissLoading();   //完成订阅之后
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("error",e.toString());
                        mView.dismissLoading();
                        //错误处理
                    }

                    @Override
                    public void onNext(PageBean<AppInfo> response) {
                        Log.e("response",response.toString());
                        if (response != null) {
                            mView.showResult(response);
                        } else {
                            mView.showNoData();
                        }
                    }
                });
    }
}
