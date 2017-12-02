package com.example.jwllls.apphelper.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.ui.base.BaseActivity;

/**
 * Created by jwllls on 2017/10/22.
 */

public class LoginActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initData();
        initView();
    }

    @Override
    public void init() {

    }

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void setupActivityComponent(BaseComponent baseApplication) {

    }

    public void initData() {

    }

    public void initView() {

    }
}
