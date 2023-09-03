package com.example.social;

import com.example.social.model.dao.AccountMapper;
import com.example.social.model.pojo.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testInsertAccount() {

        accountMapper.insert(Account.builder().uin("1234").state(12).build());
        List<Account> accounts = accountMapper.selectList(null);
        accounts.forEach(System.out::println);
        accountMapper.deleteBatchIds(accounts.stream().map(Account::getId).toList());
    }
}
