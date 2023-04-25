package com.rozz.api.apidevelopment.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemRequest {

    private UUID id;
    private BigDecimal price;
    private int quantity;

    public UUID getId() {
        return id;
    }

    public ItemRequest setId(UUID id) {
        this.id = id;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemRequest setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ItemRequest setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

}
