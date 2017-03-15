package com.qay.qbase.dagger;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.module.ScopeModule;
import com.qay.qbase.dagger.module.SingletonModule;
import com.qay.qbase.dagger.presenter.ScopePresenter;
import com.qay.qbase.dagger.presenter.SingletonPresenter;
import com.qay.qbase.dagger.view.IMainView;
import com.qay.qbase.ui.QActivity;

import javax.inject.Inject;

public class ScopeActivity extends QActivity implements IMainView {


    @Inject
    ScopePresenter scopePresenter;

    @Override
    protected void initialize() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_singleton);

        initToolbar("Scope");
        initStatusColor();

        DApp dApp = (DApp) getApplication();

        DaggerScopeComponent.builder().appComponent(dApp.getComponent()).scopeModule(new ScopeModule(this)).build().inject(this);

//        DaggerSingletonComponent.builder().singletonModule(new SingletonModule(this)).build().inject(this);


        findViewById(R.id.act_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scopePresenter.initLoad();
            }
        });

    }


    @Override
    public void afterSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
