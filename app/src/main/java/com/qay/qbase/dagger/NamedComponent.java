package com.qay.qbase.dagger;

import com.qay.qbase.dagger.module.NamedModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@Component(modules = NamedModule.class)
public interface NamedComponent {
    void inject(NamedActivity activity);
}
