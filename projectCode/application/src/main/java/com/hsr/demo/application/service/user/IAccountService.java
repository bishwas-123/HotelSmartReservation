package com.hsr.demo.application.service.user;

import com.hsr.demo.application.model.user.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
    Account save(Account account);
    Account finById(Integer accountId);
}
