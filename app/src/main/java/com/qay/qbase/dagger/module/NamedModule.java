package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class NamedModule {

    IMainView mainView;

    public NamedModule(IMainView view) {
        this.mainView = view;
    }

    @Provides
    @Named("red")
    public IMainView provideRedView() {
        return mainView;
    }


    @Provides
    @Named("blue")
    public IMainView provideBlueView() {
        return mainView;
    }

}
