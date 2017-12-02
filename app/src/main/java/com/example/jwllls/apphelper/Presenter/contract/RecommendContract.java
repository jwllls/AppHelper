package com.example.jwllls.apphelper.Presenter.contract;

import com.example.jwllls.apphelper.ui.BaseView;

/**
 * Created by jwllls on 2017/11/7.
 */

public interface RecommendContract {

    interface View extends BaseView<Presenter>{
        //此处创建View要执行的方法。

    }

    interface Presenter {
        //此处创建逻辑操作

        void getData();
    }
}
