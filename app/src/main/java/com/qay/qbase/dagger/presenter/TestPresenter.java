package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Qay on 2017/3/14.
 */
public class TestPresenter {

    @Inject
    IMainView mView;

    @Inject
    public TestPresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

}
