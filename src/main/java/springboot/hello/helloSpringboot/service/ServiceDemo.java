package springboot.hello.helloSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import springboot.hello.helloSpringboot.dao.DemoDao;

/**
 * Created by lcplcp on 2017/8/21.
 */
@Component
public class ServiceDemo {
    @Autowired
    DemoDao demoDao;
    public String testDemo(){
        String rtnAfterDosomething = "我是返回结果";
        //这里是业务代码
        return rtnAfterDosomething;
    }
    public String queryDemo(){
        return demoDao.queryDemo();
    }
}
