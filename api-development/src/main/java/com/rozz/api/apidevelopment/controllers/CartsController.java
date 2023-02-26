package com.rozz.api.apidevelopment.controllers;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

import com.rozz.api.apidevelopment.apis.CartApi;
import com.rozz.api.apidevelopment.model.Cart;
import com.rozz.api.apidevelopment.model.Item;

@RestController
public class CartsController implements CartApi {
    private static final Logger log = LoggerFactory.getLogger(CartsController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) {
        log.info("Request for customer ID: {}\nItem: {}", customerId, item);
        return ok(Collections.EMPTY_LIST);
    }

    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        throw new RuntimeException("Manual Exception thrown");
    }
}
