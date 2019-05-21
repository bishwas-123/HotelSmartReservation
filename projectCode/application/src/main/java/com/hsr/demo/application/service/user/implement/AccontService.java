package com.hsr.demo.application.service.user.implement;

import com.hsr.demo.application.model.user.Account;
import com.hsr.demo.application.repository.user.IAccountRepository;
import com.hsr.demo.application.service.user.IAccountService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccontService implements IAccountService {

    private IAccountRepository accountRepository;
    public AccontService(IAccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll(Sort.by("userName"));
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account finById(Integer accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }
}
