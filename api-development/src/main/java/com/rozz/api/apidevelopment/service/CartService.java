package com.rozz.api.apidevelopment.service;

import com.rozz.api.apidevelopment.entity.Carts.ShoppingCart;

public interface CartService {
    public ShoppingCart getCartByCustomerId(String CustomerId);

    // public List<ItemEntity> addCartItemsByCustomerId(String customerId,
    // ItemEntity item);
}
