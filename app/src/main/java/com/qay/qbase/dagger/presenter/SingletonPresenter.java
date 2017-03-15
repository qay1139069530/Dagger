package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;

/**
 * Created by Qay on 2017/3/14.
 */
public class SingletonPresenter {

    @Inject
    IMainView mView;

    @Inject
    public SingletonPresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

}
