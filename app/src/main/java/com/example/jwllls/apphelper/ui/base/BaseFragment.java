package com.example.jwllls.apphelper.ui.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jwllls.apphelper.Presenter.BasePresenter;
import com.example.jwllls.apphelper.di.component.BaseComponent;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jwllls on 2017/10/22.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

    private Unbinder mUnbinder;  //解除绑定

    private BaseApplication baseApplication;

    private View view;

    @Inject
    public
    T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(setLayout(), container, false);
        mUnbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.baseApplication = (BaseApplication) getActivity().getApplication();
        setupActivityComponent(baseApplication.getmBaseComponent());

        init();

    }

    public abstract void setupActivityComponent(BaseComponent baseComponent);

    public abstract int setLayout();

    public abstract void init();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
    }
}
