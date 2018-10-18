package cn.wl.test2.Factory;

import cn.wl.test2.product.Aircondition;
import cn.wl.test2.product.Engine;

public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
