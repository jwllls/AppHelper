package com.example.jwllls.apphelper.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.base.BaseActivity;
import com.example.jwllls.apphelper.base.BaseFragment;

/**
 * Created by jwllls on 2017/10/22.
 */

public class GameFragment extends BaseFragment {

    private BaseActivity activity;

    public static GameFragment newInstance() {
        Bundle args = new Bundle();
        GameFragment fragment = new GameFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);
        activity = (BaseActivity) getActivity();
        return view;
    }


}
