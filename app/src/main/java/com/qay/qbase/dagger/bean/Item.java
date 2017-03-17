package com.qay.qbase.dagger.bean;

import javax.inject.Inject;

/**
 * Created by Qay on 2017/3/17.
 */

public class Item {
    String name;

    @Inject
    public Item() {
        name = "测试Item";
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
