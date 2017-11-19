package com.example.jwllls.apphelper.di;

import com.example.jwllls.apphelper.view.fragment.RecommendFragment;

import dagger.Component;

/**
 * Created by jwllls on 2017/11/19.
 */

@Component(modules = RecommendMoudle.class)
public interface RecommendComponent {

    void inject(RecommendFragment fragment);
}
