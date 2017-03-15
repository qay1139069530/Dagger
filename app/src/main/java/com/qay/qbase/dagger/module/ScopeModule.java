package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.app.ActivityScope;
import com.qay.qbase.dagger.view.IMainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class ScopeModule {

    IMainView mainView;

    public ScopeModule(IMainView view) {
        this.mainView = view;
    }

    @ActivityScope
    @Provides
    public IMainView provideMainView() {
        return mainView;
    }
}
