package cn.wl.test0;

import cn.wl.test1.product.BMW;
import cn.wl.test1.product.impl.BMW320;
import cn.wl.test1.product.impl.BMW510;

public class SimpleFactory {
    public BMW createBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 510:
                return new BMW510();
             default:
                 break;
            }
            return null;
        }
}
