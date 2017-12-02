package com.example.jwllls.apphelper.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.jwllls.apphelper.Presenter.BasePresenter;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jwllls on 2017/10/22.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    private Unbinder mUnbinder;  //解除绑定

    private BaseApplication baseApplication;

    @Inject
    T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));  //字体icon，需要在super.onCreate()前调用
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        mUnbinder = ButterKnife.bind(this);
        this.baseApplication = (BaseApplication) getApplication();
        setupActivityComponent(baseApplication.getmBaseComponent());
        init();
    }

    public abstract void init();

    public abstract int setLayout();

    public abstract void setupActivityComponent(BaseComponent baseApplication);

    public void showShortToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void showLongToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
    }
}
