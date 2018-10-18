import cn.wl.Application;
import cn.wl.test2.Factory.AbstractFactory;
import cn.wl.test2.Factory.impl.FactoryBMW320;
import cn.wl.test2.Factory.impl.FactoryBMW5210;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试抽象工厂模式
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
public class Customer2 {
    @Test
    public void  buyCar(){
        //生产宝马320 系列配件
        AbstractFactory factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
        //生产宝马5210 系列配件
        AbstractFactory factoryBMW5210 = new FactoryBMW5210();
        factoryBMW5210.createEngine();
        factoryBMW5210.createAircondition();
    }
}
