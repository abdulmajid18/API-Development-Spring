//package com.rozz.api.apidevelopment.controllers;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.slf4j.Logger;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import static org.springframework.http.ResponseEntity.ok;
//
//import com.rozz.api.apidevelopment.apis.CartApi;
//import com.rozz.api.apidevelopment.dto.Cart;
//import com.rozz.api.apidevelopment.dto.Item;
//
//@RestController
//public class CartsController implements CartApi {
//    private static final Logger log = LoggerFactory.getLogger(CartsController.class);
//
//    @Override
//    @PostMapping(value = "/api/v1/carts/{customerId}/items")
//    public ResponseEntity<List<Item>> addCartItemsByCustomerId(@PathVariable("customerId") String customerId,
//            @RequestBody Item item) {
//        log.info("Request for customer ID: {}\nItem: {}", customerId, item);
//        return ok(Collections.EMPTY_LIST);
//
//    }
//
//    @GetMapping(value = "/api/v1/carts/{customerId}/items")
//    public ResponseEntity<List<Cart>> getCartByCustomerId(@PathVariable("customerId") String customerId) {
//        throw new RuntimeException("Manual Exception thrown");
//    }
//}
