package com.example.jwllls.apphelper.di.component;

import com.example.jwllls.apphelper.di.FragmentScope;
import com.example.jwllls.apphelper.di.module.RecommendModule;
import com.example.jwllls.apphelper.ui.fragment.RecommendFragment;

import dagger.Component;

/**
 * Created by jwllls on 2017/11/19.
 */

@FragmentScope
@Component(modules = RecommendModule.class, dependencies = BaseComponent.class)
public interface RecommendComponent {

    void inject(RecommendFragment fragment);
}
