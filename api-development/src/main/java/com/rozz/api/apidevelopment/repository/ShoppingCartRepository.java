package com.rozz.api.apidevelopment.repository;

import java.util.Optional;
import java.util.UUID;

import com.rozz.api.apidevelopment.entity.Carts.ShoppingCart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, UUID> {
    @Query("select c from ShoppingCart c join c.customer u where u.id = :customerId")
    Optional<ShoppingCart> findByCustomerId(@Param("customerId") UUID customerId);
}
