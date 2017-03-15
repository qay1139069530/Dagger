package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.app.QualifiedScope;
import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Qay on 2017/3/14.
 */
public class QualifiedPresenter {

    @Inject
    @QualifiedScope("red")
    IMainView mView;

    @QualifiedScope("blue")
    @Inject
    IMainView mView2;

    @Inject
    public QualifiedPresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

    public void initLoad2() {
        mView2.afterSuccess();
    }

}
