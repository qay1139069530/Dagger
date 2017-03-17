package com.qay.qbase.dagger.app;

import com.google.gson.Gson;
import com.qay.qbase.dagger.module.AModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;
import okhttp3.OkHttpClient;

/**
 * Created by Qay on 2017/3/14.
 * manger static class
 */
@Singleton
@Subcomponent(modules = AModule.class)
public interface AComponent {


}
