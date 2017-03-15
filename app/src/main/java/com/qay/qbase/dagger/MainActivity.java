package com.qay.qbase.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.module.MainModule;
import com.qay.qbase.dagger.presenter.MainPresenter;
import com.qay.qbase.dagger.view.IMainView;
import com.qay.qbase.ui.QActivity;

import javax.inject.Inject;

public class MainActivity extends QActivity implements IMainView {


    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void initialize() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        initToolbar("Dagger");
        initStatusColor();

        DApp dApp = (DApp) getApplication();


        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build().inject(this);

        findViewById(R.id.act_main_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.initLoad();
            }
        });

        findViewById(R.id.act_main_test02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SingletonActivity.class));
            }
        });

        findViewById(R.id.act_main_test03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScopeActivity.class));
            }
        });

        findViewById(R.id.act_main_test04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NamedActivity.class));
            }
        });


    }


    @Override
    public void afterSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
