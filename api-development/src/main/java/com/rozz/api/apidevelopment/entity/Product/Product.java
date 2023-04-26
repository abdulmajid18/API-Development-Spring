package com.rozz.api.apidevelopment.entity.Product;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;

import com.rozz.api.apidevelopment.entity.Accounts.Account;
import com.rozz.api.apidevelopment.entity.Items.Item;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "COUNT")
    private int count;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @OneToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
    private ProductCategory category;

    @OneToMany(mappedBy = "product")
    private List<Item> items;

    @OneToOne
    @JoinColumn(name = "SELLER_ID", referencedColumnName = "ID")
    private Account seller;

    public Product(UUID id, String name, String description, BigDecimal price, int count, String imageUrl, ProductCategory category, List<Item> items, Account seller) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.imageUrl = imageUrl;
        this.category = category;
        this.items = items;
        this.seller = seller;
    }

    public Product() {
    }

    public UUID getId() {
        return id;
    }

    public Product setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Product setCount(int count) {
        this.count = count;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Product setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public Product setCategory(ProductCategory category) {
        this.category = category;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Product setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Account getSeller() {
        return seller;
    }

    public Product setSeller(Account seller) {
        this.seller = seller;
        return this;
    }
}
