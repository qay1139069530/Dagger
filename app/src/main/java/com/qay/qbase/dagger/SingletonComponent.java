package com.qay.qbase.dagger;

import com.qay.qbase.dagger.module.SingletonModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@Singleton
@Component(modules = SingletonModule.class)
public interface SingletonComponent {
    void inject(SingletonActivity activity);
}
