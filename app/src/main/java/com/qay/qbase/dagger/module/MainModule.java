package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.view.IMainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class MainModule {

    IMainView mainView;

    public MainModule(IMainView view) {
        this.mainView = view;
    }

    @Provides
    public IMainView provideMainView() {
        return mainView;
    }
}
