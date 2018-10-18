import cn.wl.Application;
import cn.wl.test1.factory.BMWFactory;
import cn.wl.test1.factory.impl.BMW320Factory;
import cn.wl.test1.factory.impl.BMW510Factory;
import cn.wl.test1.product.impl.BMW320;
import cn.wl.test1.product.impl.BMW510;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * 测试工厂发放模式
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
public class Customer1 {
    @Test
    public void  creatCar(){
        BMWFactory factoryBMW320 = new BMW320Factory();
        BMW320 bmw320 = factoryBMW320.createBMW();

        BMWFactory factoryBMW510 = new BMW510Factory();
        BMW510 bmw510 = factoryBMW510.createBMW();

    }
}
