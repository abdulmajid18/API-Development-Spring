package com.rozz.api.apidevelopment.service;

import com.rozz.api.apidevelopment.entity.CartEntity;
import com.rozz.api.apidevelopment.entity.ItemEntity;

public interface CartService {
    public CartEntity getCartByCustomerId(String CustomerId);

    // public List<ItemEntity> addCartItemsByCustomerId(String customerId,
    // ItemEntity item);
}
