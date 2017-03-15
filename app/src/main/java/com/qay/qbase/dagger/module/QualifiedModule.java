package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.app.QualifiedScope;
import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class QualifiedModule {

    IMainView mainView;

    public QualifiedModule(IMainView view) {
        this.mainView = view;
    }

    @Provides
    @QualifiedScope("red")
    public IMainView provideRedView() {
        return mainView;
    }


    @Provides
    @QualifiedScope("blue")
    public IMainView provideBlueView() {
        return mainView;
    }

}
