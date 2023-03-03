package com.rozz.api.apidevelopment.service;

import java.util.Optional;
import java.util.UUID;

import com.rozz.api.apidevelopment.entity.CustomerEntity;
import com.rozz.api.apidevelopment.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
  private CustomerRepository repository;

  public CustomerServiceImpl(CustomerRepository repository) {
    this.repository = repository;
  }

  @Override
  public void deleteCustomerById(String id) {
    repository.deleteById(UUID.fromString(id));
  }

  @Override
  public Iterable<CustomerEntity> getAllCustomers() {
    return repository.findAll();
  }

  @Override
  public Optional<CustomerEntity> getCustomerById(String id) {
    return repository.findById(UUID.fromString(id));
  }

}
