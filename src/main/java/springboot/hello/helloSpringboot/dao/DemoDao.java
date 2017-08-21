package springboot.hello.helloSpringboot.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lcplcp on 2017/8/21.
 */
@Mapper
public interface DemoDao {
    @Select({"select demo_param from  demo "})
    String queryDemo();
}

