package com.itlike.demo2;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo2
 * @ClassName: AccountDao
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/20 9:13
 * @Version: 1.0
 */
public interface AccountDao {
    /**
     * add money
     * @param name 用户
     * @param money 金额
     */
    public void addMoney(String name,Double money);

    /**
     * 减钱
     * @param name 用户名
     * @param money 金额
     */
    public  void minusMoney(String name,Double money);
}
