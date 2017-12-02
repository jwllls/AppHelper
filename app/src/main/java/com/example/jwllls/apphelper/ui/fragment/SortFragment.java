package com.example.jwllls.apphelper.ui.fragment;

import android.os.Bundle;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.ui.base.BaseFragment;

/**
 * Created by jwllls on 2017/10/22.
 */

public class SortFragment extends BaseFragment {



    public static SortFragment newInstance() {
        Bundle args = new Bundle();
        SortFragment fragment = new SortFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void setupActivityComponent(BaseComponent baseComponent) {

    }

    @Override
    public int setLayout() {
        return R.layout.fragment_sort;
    }

    @Override
    public void init() {

    }

}


