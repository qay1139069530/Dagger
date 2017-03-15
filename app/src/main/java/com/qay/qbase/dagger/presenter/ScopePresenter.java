package com.qay.qbase.dagger.presenter;

import com.qay.qbase.dagger.app.ActivityScope;
import com.qay.qbase.dagger.view.IMainView;

import javax.inject.Inject;

/**
 * Created by Qay on 2017/3/14.
 */
@ActivityScope
public class ScopePresenter {

    @Inject
    IMainView mView;

    @Inject
    public ScopePresenter() {
    }

    public void initLoad() {
        mView.afterSuccess();
    }

}
