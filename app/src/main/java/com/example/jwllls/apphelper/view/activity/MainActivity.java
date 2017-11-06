package com.example.jwllls.apphelper.view.activity;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.view.adapter.MainViewPagerAdapter;
import com.example.jwllls.apphelper.view.base.BaseActivity;
import com.example.jwllls.apphelper.view.fragment.GameFragment;
import com.example.jwllls.apphelper.view.fragment.RankFragment;
import com.example.jwllls.apphelper.view.fragment.RecommendFragment;
import com.example.jwllls.apphelper.view.fragment.SortFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    // @BindView(R.id.main_tablayout)
    TabLayout tabLayout;
    //@BindView(R.id.main_viewpager)
    ViewPager mainViewpager;


    private MainViewPagerAdapter viewPagerAdapter;

    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initFragment();
        initData();


    }


    public void initData() {
        viewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), this, fragments);
        mainViewpager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(mainViewpager);
    }


    public void initView() {
        tabLayout = (TabLayout) findViewById(R.id.main_tablayout);
        mainViewpager = (ViewPager) findViewById(R.id.main_viewpager);
    }


    private void initFragment() {
        fragments.add(RecommendFragment.newInstance());
        fragments.add(RankFragment.newInstance());
        fragments.add(GameFragment.newInstance());
        fragments.add(SortFragment.newInstance());


    }
}
