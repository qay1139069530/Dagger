package com.qay.qbase.dagger.app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Qay on 2017/3/14.
 */
@Module
public class HttpModule {
    public HttpModule() {
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

}
