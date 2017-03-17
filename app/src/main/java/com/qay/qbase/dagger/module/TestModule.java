package com.qay.qbase.dagger.module;

import com.google.gson.Gson;

import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@dagger.Module
public class TestModule {


    @Provides
    public Gson providesGosn() {
        return new Gson();
    }


}
