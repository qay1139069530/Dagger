package com.qay.qbase.dagger;

import com.qay.qbase.dagger.app.ActivityScope;
import com.qay.qbase.dagger.app.AppComponent;
import com.qay.qbase.dagger.module.ScopeModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@ActivityScope
@Component(modules = ScopeModule.class,dependencies = AppComponent.class)
public interface ScopeComponent {
    void inject(ScopeActivity activity);
}
