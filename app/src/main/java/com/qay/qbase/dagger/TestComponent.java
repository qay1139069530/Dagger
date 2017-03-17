package com.qay.qbase.dagger;

import com.qay.qbase.dagger.app.AppComponent;
import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.app.ItemScope;
import com.qay.qbase.dagger.module.ItemModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@ItemScope
@Component(dependencies = AppComponent.class,modules = {ItemModule.class})
public abstract class TestComponent {
    public static TestComponent instance;

    public static TestComponent getInstance() {
        if (instance == null) {
            instance = DaggerTestComponent.builder().appComponent(DApp.getInstatnce().getComponent()).build();
        }
        return instance;
    }

    abstract void inject(TestActivity activity);
    abstract void inject(Test02Activity activity);
}
