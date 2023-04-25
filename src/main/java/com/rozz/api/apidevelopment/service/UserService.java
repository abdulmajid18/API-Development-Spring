package com.rozz.api.apidevelopment.service;

import java.util.Optional;

import com.rozz.api.apidevelopment.entity.UserEntity;

public interface UserService {
    public Optional<UserEntity> getCustomerById(String id);

    public Iterable<UserEntity> getAllCustomers();

    public void deleteCustomerById(String id);
}
