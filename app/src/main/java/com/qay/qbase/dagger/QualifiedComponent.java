package com.qay.qbase.dagger;

import com.qay.qbase.dagger.module.QualifiedModule;

import dagger.Component;

/**
 * Created by Qay on 2017/3/15.
 */
@Component(modules = QualifiedModule.class)
public interface QualifiedComponent {
    void inject(QualifiedActivity activity);
}
