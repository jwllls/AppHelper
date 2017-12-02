package com.example.jwllls.apphelper.ui.fragment;

import android.os.Bundle;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.ui.base.BaseFragment;

/**
 * Created by jwllls on 2017/10/22.
 */

public class GameFragment extends BaseFragment {


    public static GameFragment newInstance() {
        Bundle args = new Bundle();
        GameFragment fragment = new GameFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setupActivityComponent(BaseComponent baseComponent) {

    }

    @Override
    public int setLayout() {
        return R.layout.fragment_game;
    }

    @Override
    public void init() {

    }


}
