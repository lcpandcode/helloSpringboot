package springboot.hello.helloSpringboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.hello.helloSpringboot.service.ServiceDemo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringbootApplicationTests {
	//注入
	@Autowired
	ServiceDemo serviceDemo ;
	@Test
	public void testDemo() {
		String rtn = serviceDemo.testDemo();
		Assert.assertEquals(rtn,"我是返回结果");
	}

}
