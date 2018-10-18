package cn.wl.test2.Factory.impl;

import cn.wl.test2.Factory.AbstractFactory;
import cn.wl.test2.product.Aircondition;
import cn.wl.test2.product.Engine;
import cn.wl.test2.product.impl.AirconditionB;
import cn.wl.test2.product.impl.EngineB;

public class FactoryBMW5210  implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {

        return new AirconditionB();
    }
}
