package com.rozz.api.apidevelopment.entity.Items;

import com.rozz.api.apidevelopment.entity.Carts.ShoppingCart;
import com.rozz.api.apidevelopment.entity.Product.Product;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
    private Product product;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "QUANTITY")
    private int quantity;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<ShoppingCart> carts;


    public UUID getId() {
        return id;
    }

    public Item setId(UUID id) {
        this.id = id;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public Item setProduct(Product product) {
        this.product = product;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Item setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<ShoppingCart> getCarts() {
        return carts;
    }

    public Item setCarts(List<ShoppingCart> carts) {
        this.carts = carts;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity && Objects.equals(id, item.id) && Objects.equals(product, item.product) && Objects.equals(price, item.price) && Objects.equals(carts, item.carts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price, quantity, carts);
    }
}
