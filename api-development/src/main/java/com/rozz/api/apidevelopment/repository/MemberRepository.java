package com.rozz.api.apidevelopment.repository;

import java.util.UUID;

import com.rozz.api.apidevelopment.entity.Accounts.Customer;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Customer, UUID> {

}