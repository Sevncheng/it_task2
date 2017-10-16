package cn.ssm.test;

import cn.ssm.entity.Emp;
import cn.ssm.service.MybatisService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class demo1 {

    @Test
    public void test111() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        MybatisService mybatisService = (MybatisService) ac.getBean("mybatisService");
        Emp emp = new Emp(3,"测试");
        mybatisService.add(emp);
    }
}
