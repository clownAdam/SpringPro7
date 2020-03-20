package com.itlike.demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo1
 * @ClassName: SpringJdbcTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 21:53
 * @Version: 1.0
 */
public class SpringJdbcTest {
    @Test
    public void test(){
        //创建连接池(数据库相关信息)
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        //使用jdbc模板
        JdbcTemplate template = new JdbcTemplate(dataSource);
        template.update("insert into account value (null,?,?)","itlike",1000d);
    }
}
