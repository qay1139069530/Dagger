package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;

/**
 * Created by Qay on 2017/3/14.
 */
public class MainPresenter {

    @Inject
    IMainView mView;

    @Inject
    public MainPresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

    public void initLoad2() {
        mView.afterSuccess();
    }
}
