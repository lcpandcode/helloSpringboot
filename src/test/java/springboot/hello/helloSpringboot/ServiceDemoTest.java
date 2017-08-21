package springboot.hello.helloSpringboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.hello.helloSpringboot.service.ServiceDemo;

/**
 * Created by lcplcp on 2017/8/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceDemoTest {
    @Autowired
    ServiceDemo serviceDemo;
    @Test
    public void testDemo() {
        String rtn = serviceDemo.testDemo();
        Assert.assertEquals(rtn, "我是返回结果");
    }
    @Test
    public void testQueryDemo() {
        String rtn = serviceDemo.queryDemo();
        Assert.assertEquals(rtn, "demo1");
    }

}
