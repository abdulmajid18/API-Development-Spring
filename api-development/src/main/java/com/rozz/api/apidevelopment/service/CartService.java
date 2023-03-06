package com.rozz.api.apidevelopment.service;

import java.util.Optional;

import com.rozz.api.apidevelopment.entity.CartEntity;
import com.rozz.api.apidevelopment.entity.ItemEntity;

import java.util.List;

public interface CartService {
    public Optional<CartEntity> getCartByCustomerId(String id);

    public List<ItemEntity> addCartItemsByCustomerId(String customerId, ItemEntity item);
}
