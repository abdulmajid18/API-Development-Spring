//package com.rozz.api.apidevelopment.service;
//
//import java.util.Optional;
//import java.util.UUID;
//
//import com.rozz.api.apidevelopment.entity.Accounts.Customer;
//import com.rozz.api.apidevelopment.repository.UserRepository;
//
//public class UserServiceImpl implements UserService {
//  private UserRepository repository;
//
//  public UserServiceImpl(UserRepository repository) {
//    this.repository = repository;
//  }
//
//  @Override
//  public void deleteCustomerById(String id) {
//    repository.deleteById(UUID.fromString(id));
//  }
//
//  @Override
//  public Iterable<Customer> getAllCustomers() {
//    return repository.findAll();
//  }
//
//  @Override
//  public Optional<Customer> getCustomerById(String id) {
//    return repository.findById(UUID.fromString(id));
//  }
//
//}
