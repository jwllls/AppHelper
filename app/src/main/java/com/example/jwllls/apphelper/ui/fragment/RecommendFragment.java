package com.example.jwllls.apphelper.ui.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.jwllls.apphelper.Presenter.RecommendPresenter;
import com.example.jwllls.apphelper.Presenter.contract.RecommendContract;
import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.data.bean.AppInfo;
import com.example.jwllls.apphelper.data.bean.PageBean;
import com.example.jwllls.apphelper.di.component.BaseComponent;
import com.example.jwllls.apphelper.di.component.DaggerRecommendComponent;
import com.example.jwllls.apphelper.di.module.RecommendModule;
import com.example.jwllls.apphelper.ui.adapter.RecommendAdapter;
import com.example.jwllls.apphelper.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by jwllls on 2017/10/22.
 */

public class RecommendFragment extends BaseFragment<RecommendPresenter> implements RecommendContract.View {

    @BindView(R.id.recycle_view)
    RecyclerView mRecycleView;


    @Override
    public int setLayout() {
        return R.layout.fragment_recommend;
    }


    @Inject
    ProgressDialog mProgressDialog;


    private RecommendAdapter mAdapter;


    public static RecommendFragment newInstance() {
        Bundle args = new Bundle();
        RecommendFragment fragment = new RecommendFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void setupActivityComponent(BaseComponent baseComponent) {
        DaggerRecommendComponent.builder().baseComponent(baseComponent).recommendModule(new RecommendModule(this)).build().inject(this);
    }


    private void initRecyclerView() {

        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }


    @Override
    public void init() {
        initRecyclerView();
        mPresenter.getData();
    }


    @Override
    public void showLoading() {
        mProgressDialog.show();
    }

    @Override
    public void dismissLoading() {
        mProgressDialog.dismiss();
    }


    @Override
    public void showResult(PageBean<AppInfo> respondse) {
        List<AppInfo> list = respondse.getDatas();
        mAdapter = new RecommendAdapter(R.layout.item_recommend);
        mAdapter.setNewData(list);
        mRecycleView.setAdapter(mAdapter);
    }

    @Override
    public void showNoData() {
        Toast.makeText(getActivity(), "没有数据", Toast.LENGTH_SHORT).show();
    }

}
