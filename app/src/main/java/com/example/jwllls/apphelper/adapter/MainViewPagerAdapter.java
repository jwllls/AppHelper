package com.example.jwllls.apphelper.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jwllls.apphelper.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwllls on 2017/10/22.
 */

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    private BaseActivity activity;


    public MainViewPagerAdapter(FragmentManager fm, BaseActivity activity, List<Fragment> fragments) {
        super(fm);
        this.activity = activity;
        this.fragments = fragments;
        initTitle();
    }


    public void initTitle() {
        titles.add("推荐");
        titles.add("排行");
        titles.add("游戏");
        titles.add("分类");

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
