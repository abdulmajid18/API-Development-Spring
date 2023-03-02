package com.rozz.api.apidevelopment.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rozz.api.apidevelopment.entity.CartEntity;

public interface CartRepository extends CrudRepository<CartEntity, UUID> {
    @Query("select c from CartEntity c join c.user u where u.id = :customerId")
    public Optional<CartEntity> findByCustomerId(@Param("custoomerId") UUID customerId);
}
