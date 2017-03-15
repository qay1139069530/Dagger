package com.qay.qbase.dagger;

import com.qay.qbase.dagger.module.MainModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
