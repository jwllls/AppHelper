package com.example.jwllls.apphelper.Presenter;

import android.util.Log;

import com.example.jwllls.apphelper.Presenter.contract.RecommendContract;
import com.example.jwllls.apphelper.data.model.RecommendModel;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by jwllls on 2017/11/7.
 */

public class RecommendPresenter extends BasePresenter<RecommendModel,RecommendContract.View> implements RecommendContract.Presenter {

    @Inject
    public RecommendPresenter(RecommendModel mModel, RecommendContract.View vView) {
        super(mModel, vView);
    }

    @Override
    public void getData() {
        mView.showLoading();

        mModel.getApps(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("data",call.toString()+"=="+ e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e("result",response.body().toString());
                mView.dismissLoading();

            }
        });
    }
}
