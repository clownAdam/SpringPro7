package com.itlike.demo1;

import com.itlike.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo1
 * @ClassName: SpringJdbcTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/19 21:53
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJdbcTest2 {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        jdbcTemplate.update("insert into account values(null,?,?)","context:properties",100d);
        jdbcTemplate.update("delete from account where id=?",1);
        jdbcTemplate.update("update account set name =?,money=? where id=?","clown",2000d,2);

    }
    @Test
    public void query(){
        String name = jdbcTemplate.queryForObject("select name from account where id=?", String.class, 2);
        System.out.println(name);
    }
    @Test
    public void count(){
        Integer integer = jdbcTemplate.queryForObject("select count(*) from account", int.class);
        System.out.println(integer);
    }
    @Test
    public void queryAccount(){
        Account account = jdbcTemplate.queryForObject("select * from account where id=?", new MyRowMap(), 2);
        System.out.println(account);
    }
    @Test
    public void queryListAccount(){
        List<Account> query = jdbcTemplate.query("select * from account", new MyRowMap());
        System.out.println(query);
    }
}
class MyRowMap implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getDouble("money"));
        return account;
    }
}
