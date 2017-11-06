package com.example.jwllls.apphelper.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.view.base.BaseActivity;
import com.example.jwllls.apphelper.view.base.BaseFragment;

/**
 * Created by jwllls on 2017/10/22.
 */

public class SortFragment extends BaseFragment {


    private BaseActivity activity;

    public static SortFragment newInstance() {
        Bundle args = new Bundle();
        SortFragment fragment = new SortFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sort, container, false);
        activity = (BaseActivity) getActivity();
        return view;
    }

}


