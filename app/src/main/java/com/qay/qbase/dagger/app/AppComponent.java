package com.qay.qbase.dagger.app;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by Qay on 2017/3/14.
 * manger static class
 */
@Singleton
@Component(modules = {AppModule.class,HttpModule.class})
public interface AppComponent {

    DApp app();

    //gson
    Gson gson();

    OkHttpClient client();
}
