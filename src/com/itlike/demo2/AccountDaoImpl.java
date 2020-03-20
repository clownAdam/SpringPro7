package com.itlike.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo2
 * @ClassName: AccountDaoImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/20 9:41
 * @Version: 1.0
 */

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
//    private JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void addMoney(String name, Double money) {
        this.getJdbcTemplate().update("update account set money=money+? where name =?",money,name);
    }

    @Override
    public void minusMoney(String name, Double money) {
        this.getJdbcTemplate().update("update account set money=money-? where name =?",money,name);
    }
}
