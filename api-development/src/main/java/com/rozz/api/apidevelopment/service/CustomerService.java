package com.rozz.api.apidevelopment.service;

import java.util.Optional;

import com.rozz.api.apidevelopment.entity.CustomerEntity;

public interface CustomerService {
    public Optional<CustomerEntity> getCustomerById(String id);

    public Iterable<CustomerEntity> getAllCustomers();

    public void deleteCustomerById(String id);
}
