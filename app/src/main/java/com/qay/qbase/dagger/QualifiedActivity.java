package com.qay.qbase.dagger;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qay.qbase.dagger.app.DApp;
import com.qay.qbase.dagger.module.NamedModule;
import com.qay.qbase.dagger.presenter.NamedPresenter;
import com.qay.qbase.dagger.presenter.QualifiedPresenter;
import com.qay.qbase.dagger.view.IMainView;
import com.qay.qbase.ui.QActivity;

import javax.inject.Inject;

public class QualifiedActivity extends QActivity implements IMainView {


    @Inject
    QualifiedPresenter qualifiedPresenter;

    @Override
    protected void initialize() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_named);

        initToolbar("Named");
        initStatusColor();

        DApp dApp = (DApp) getApplication();



        findViewById(R.id.act_named_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qualifiedPresenter.initLoad();
            }
        });


        findViewById(R.id.act_named_test02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qualifiedPresenter.initLoad2();
            }
        });
    }


    @Override
    public void afterSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
