package com.rozz.api.apidevelopment.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.rozz.api.apidevelopment.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

}
