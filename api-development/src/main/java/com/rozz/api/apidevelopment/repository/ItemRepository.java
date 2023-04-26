package com.rozz.api.apidevelopment.repository;

import java.util.UUID;
import java.util.List;

import com.rozz.api.apidevelopment.entity.Items.Item;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, UUID> {
    @Query(value = "select i.* from ecomm.cart c, ecomm.item i, ecomm.customer u, ecomm.cart_item ci where u.id=:customerId and c.customer_id=u.id and c.id=ci.cart_id and i.id=ci.item_id", nativeQuery = true)
    Iterable<Item> findByCustomerId(String customerId);

    @Modifying
    @Query(value = "delete from ecomm.cart_item where item_id in (:ids) and cart_id = :cartId", nativeQuery = true, countQuery = "5")
    void deleteCartItemJoinById(List<UUID> ids, UUID cartId);
}
