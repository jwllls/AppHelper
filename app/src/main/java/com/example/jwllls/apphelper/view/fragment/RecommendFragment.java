package com.example.jwllls.apphelper.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.view.base.BaseActivity;
import com.example.jwllls.apphelper.view.base.BaseFragment;
import com.example.jwllls.apphelper.Presenter.contract.RecommendContract;

/**
 * Created by jwllls on 2017/10/22.
 */

public class RecommendFragment extends BaseFragment implements RecommendContract.View {

    private BaseActivity activity;



    public static RecommendFragment newInstance() {
        Bundle args = new Bundle();
        RecommendFragment fragment = new RecommendFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, container, false);
        activity = (BaseActivity) getActivity();
        return view;
    }


    @Override
    public void setPresenter(RecommendContract.Presenter presenter) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
