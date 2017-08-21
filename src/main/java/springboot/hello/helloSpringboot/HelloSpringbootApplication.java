package springboot.hello.helloSpringboot;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication//这里的MybatisAutoConfiguration.class对应你的数据库框架
public class HelloSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}
}
