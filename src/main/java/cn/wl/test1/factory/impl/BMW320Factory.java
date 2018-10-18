package cn.wl.test1.factory.impl;

import cn.wl.test1.factory.BMWFactory;
import cn.wl.test1.product.impl.BMW320;

public class BMW320Factory implements BMWFactory {

    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
