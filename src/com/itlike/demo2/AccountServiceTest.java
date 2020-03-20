package com.itlike.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo2
 * @ClassName: AccountTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/21 0:06
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceTest {
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void test(){
        accountService.tranceforMoney("zs","ls",100d);
    }
}
