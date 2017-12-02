package com.example.jwllls.apphelper.ui.fragment;

import android.os.Bundle;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.ui.base.BaseActivity;
import com.example.jwllls.apphelper.ui.base.BaseFragment;

/**
 * Created by jwllls on 2017/10/22.
 */

public class RankFragment extends BaseFragment {


    private BaseActivity activity;

    public static RankFragment newInstance() {
        Bundle args = new Bundle();
        RankFragment fragment = new RankFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void setupActivityComponent(BaseComponent baseComponent) {

    }

    @Override
    public int setLayout() {
        return R.layout.fragment_rank;
    }

    @Override
    public void init() {

    }


}
