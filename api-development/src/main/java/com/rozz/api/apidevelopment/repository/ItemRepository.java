package com.rozz.api.apidevelopment.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.rozz.api.apidevelopment.entity.ItemEntity;

public interface ItemRepository extends CrudRepository<ItemEntity, UUID> {

}
