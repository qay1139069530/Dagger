package com.qay.qbase.dagger.app;


import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class AppModule {

    DApp dApp;

    public AppModule(DApp app) {
        this.dApp = app;
    }

    @Provides
    @Singleton
    DApp provideDApp() {
        return dApp;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }

}
