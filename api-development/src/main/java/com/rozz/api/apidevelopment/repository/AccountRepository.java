package com.rozz.api.apidevelopment.repository;

import com.rozz.api.apidevelopment.entity.Accounts.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AccountRepository extends CrudRepository<Account, UUID> {
}
