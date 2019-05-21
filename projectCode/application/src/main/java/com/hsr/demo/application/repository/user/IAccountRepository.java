package com.hsr.demo.application.repository.user;

import com.hsr.demo.application.model.user.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Integer> {
}
