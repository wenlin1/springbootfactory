package cn.wl.test2.Factory.impl;

import cn.wl.test2.Factory.AbstractFactory;
import cn.wl.test2.product.Aircondition;
import cn.wl.test2.product.Engine;
import cn.wl.test2.product.impl.AirconditionA;
import cn.wl.test2.product.impl.EngineA;

public class FactoryBMW320 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
