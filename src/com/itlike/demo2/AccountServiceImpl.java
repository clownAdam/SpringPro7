package com.itlike.demo2;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @ProjectName: SpringPro7
 * @Package: com.itlike.demo2
 * @ClassName: AccountServiceImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/21 0:04
 * @Version: 1.0
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void tranceforMoney(String from, String to, Double monye) {


        this.transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.minusMoney(from, monye);
                accountDao.addMoney(to, monye);
            }
        });

    }
}
