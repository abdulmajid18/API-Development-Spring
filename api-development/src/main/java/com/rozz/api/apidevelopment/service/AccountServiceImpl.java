package com.rozz.api.apidevelopment.service;

import com.rozz.api.apidevelopment.dto.AccountRequest;
import com.rozz.api.apidevelopment.entity.Accounts.Account;
import com.rozz.api.apidevelopment.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements  AccountService{

    private AccountRepository accountRepository;
    private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void createAccount(AccountRequest accountRequest) {
        Account accountEntity = new Account();
        accountEntity.setFirstName(accountRequest.getFirstName())
                .setLastName(accountRequest.getLastName())
                .setUserName(accountRequest.getUserName())
                .setPassword(accountRequest.getPassword())
                .setEmail(accountRequest.getEmail());
        accountRepository.save(accountEntity);
        log.info("Request for Creating customer Name: {}\n", accountEntity.getUserName());

    }
}
