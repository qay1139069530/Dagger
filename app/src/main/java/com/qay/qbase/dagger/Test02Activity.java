package com.qay.qbase.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.bean.Item;
import com.qay.qbase.ui.QActivity;

import javax.inject.Inject;
import javax.inject.Named;

public class Test02Activity extends QActivity {


    private TextView mTvTest;

    @Inject
    @Named("Name")
    Item item;


    @Inject
    Gson mGson;

    @Override
    protected void initialize() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);
        initToolbar("Test02");
        initStatusColor();
        mTvTest = (TextView) findViewById(R.id.act_test_tv);


        DApp dApp = (DApp) getApplication();

        //DaggerTestComponent.builder().build().inject(this);

        TestComponent.getInstance().inject(this);

        initView();
    }

    private void initView() {
        String json = mGson.toJson(item);
        String text = json + ",mPoetry:"+ item;
        mTvTest.setText(text);
    }

}
