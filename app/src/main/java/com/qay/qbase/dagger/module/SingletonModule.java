package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.app.ActivityScope;
import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class SingletonModule {

    IMainView mainView;

    public SingletonModule(IMainView view) {
        this.mainView = view;
    }

    @Provides
    @Singleton
    public IMainView provideMainView() {
        return mainView;
    }
}
