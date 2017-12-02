package com.example.jwllls.apphelper.ui.activity;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.ui.adapter.MainViewPagerAdapter;
import com.example.jwllls.apphelper.ui.base.BaseActivity;
import com.example.jwllls.apphelper.ui.fragment.GameFragment;
import com.example.jwllls.apphelper.ui.fragment.RankFragment;
import com.example.jwllls.apphelper.ui.fragment.RecommendFragment;
import com.example.jwllls.apphelper.ui.fragment.SortFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.main_tablayout)
    TabLayout tabLayout;
    @BindView(R.id.main_viewpager)
    ViewPager mainViewpager;

    private BaseComponent mBaseComponent;


    private MainViewPagerAdapter viewPagerAdapter;

    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment();
        init();

    }

    @Override
    public void init() {
        tabLayout = (TabLayout) findViewById(R.id.main_tablayout);
        mainViewpager = (ViewPager) findViewById(R.id.main_viewpager);
        viewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), this, fragments);
        mainViewpager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(mainViewpager);
    }

    private void initFragment() {
        fragments.add(RecommendFragment.newInstance());
        fragments.add(RankFragment.newInstance());
        fragments.add(GameFragment.newInstance());
        fragments.add(SortFragment.newInstance());
    }


    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void setupActivityComponent(BaseComponent baseComponent) {
        mBaseComponent = baseComponent;
    }


    public BaseComponent getBaseComponent(){
        return mBaseComponent;
    }



}
