package com.qay.qbase.dagger.app;

import com.qay.qbase.app.QApp;

/**
 * Created by Qay on 2017/3/14.
 */

public class DApp extends QApp {

    public static DApp instatnce;

    public static DApp getInstatnce(){
        return instatnce;
    }


    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instatnce = this;
        appComponent = DaggerAppComponent.builder()
                .httpModule(new HttpModule())
                .appModule(new AppModule(this))
                .build();

        appComponent.client();

    }

    public AppComponent getComponent(){
        return appComponent;
    }
}
