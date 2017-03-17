package com.qay.qbase.dagger.module;

import com.qay.qbase.dagger.app.ItemScope;
import com.qay.qbase.dagger.bean.Item;

import dagger.Provides;

/**
 * Created by Qay on 2017/3/14.
 */
@dagger.Module
public class AModule {

    @Provides
    public String provideStr() {
        return "ItemModule Str";
    }

    //在此地方添加@named则必须在@inject时，添加@Named否则会调用Item中@Inject构造方法
    @Provides
    @ItemScope
    public Item provideItem(String text) {
        //如果要调用ItemModule Name 则必须在参数中添加@Nameed("Name")，否则会调用没添加@Named的方法
        return new Item(text);
    }

}
