import cn.wl.Application;
import cn.wl.test0.SimpleFactory;
import cn.wl.test1.product.BMW;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试简单工厂
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
 public class Customer0 {
    @Test
    public void creatCar() {
        SimpleFactory factory = new SimpleFactory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw510 = factory.createBMW(510);
    }
}
