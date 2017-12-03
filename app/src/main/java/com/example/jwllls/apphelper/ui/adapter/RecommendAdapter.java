package com.example.jwllls.apphelper.ui.adapter;

import android.support.annotation.LayoutRes;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.jwllls.apphelper.R;
import com.example.jwllls.apphelper.data.bean.AppInfo;

/**
 * Created by jwllls on 2017/12/2.
 */

public class RecommendAdapter extends BaseQuickAdapter<AppInfo, BaseViewHolder> {


    public RecommendAdapter(@LayoutRes int layoutResId) {
        super(layoutResId);

    }

    @Override
    protected void convert(BaseViewHolder helper, AppInfo item) {
        Glide.with(mContext).load(item.getIcon()).into((ImageView) helper.getView(R.id.iv_icon));
        helper.setText(R.id.tv_displayName, item.getDisplayName());
        helper.setText(R.id.tv_apkSize, item.getApkSize()+"");
        helper.setText(R.id.tv_briefShow, item.getBriefShow());
    }
}
