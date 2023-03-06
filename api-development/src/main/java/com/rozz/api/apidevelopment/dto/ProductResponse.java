package com.rozz.api.apidevelopment.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductResponse {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private int count;
    private String imageUrl;

    public ProductResponse(UUID id, String name,
            String description, BigDecimal price, int count, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.count = count;
        this.imageUrl = imageUrl;
    }

    public ProductResponse() {

    }

    public UUID getId() {
        return id;
    }

    public ProductResponse setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductResponse setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getCount() {
        return count;
    }

    public ProductResponse setCount(int count) {
        this.count = count;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ProductResponse setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

}
