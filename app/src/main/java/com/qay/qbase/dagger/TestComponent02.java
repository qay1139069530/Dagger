package com.qay.qbase.dagger;

import com.qay.qbase.dagger.app.ItemScope;
import com.qay.qbase.dagger.module.ItemModule;
import com.qay.qbase.dagger.module.TestModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@ItemScope
@Component(modules = {TestModule.class, ItemModule.class})
public interface TestComponent02 {
    void inject(TestActivity activity);
}
