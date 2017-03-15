package com.qay.qbase.dagger;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.module.MainModule;
import com.qay.qbase.dagger.module.SingletonModule;
import com.qay.qbase.dagger.presenter.MainPresenter;
import com.qay.qbase.dagger.presenter.SingletonPresenter;
import com.qay.qbase.dagger.view.IMainView;
import com.qay.qbase.ui.QActivity;

import javax.inject.Inject;

public class SingletonActivity extends QActivity implements IMainView {


    @Inject
    SingletonPresenter singletonPresenter;

    @Override
    protected void initialize() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_singleton);

        initToolbar("Singleton");
        initStatusColor();

        DApp dApp = (DApp) getApplication();

        DaggerSingletonComponent.builder().singletonModule(new SingletonModule(this)).build().inject(this);


        findViewById(R.id.act_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singletonPresenter.initLoad();
            }
        });

    }


    @Override
    public void afterSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
