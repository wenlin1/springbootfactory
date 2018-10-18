package cn.wl.test1.factory.impl;

import cn.wl.test1.factory.BMWFactory;
import cn.wl.test1.product.impl.BMW510;

public class BMW510Factory implements BMWFactory {

    @Override
    public BMW510 createBMW() {
        return new BMW510();
    }
}
