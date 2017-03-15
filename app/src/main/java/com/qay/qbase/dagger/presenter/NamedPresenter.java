package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Qay on 2017/3/14.
 */
public class NamedPresenter {

    @Inject
    @Named("red")
    IMainView mView;

    @Named("blue")
    @Inject
    IMainView mView2;

    @Inject
    public NamedPresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

    public void initLoad2() {
        mView2.afterSuccess();
    }

}
