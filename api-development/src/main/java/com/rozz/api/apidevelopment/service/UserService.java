package com.rozz.api.apidevelopment.service;

import com.rozz.api.apidevelopment.entity.Accounts.Customer;

import java.util.Optional;

public interface UserService {
    public Optional<Customer> getCustomerById(String id);

    public Iterable<Customer> getAllCustomers();

    public void deleteCustomerById(String id);
}
