package com.rozz.api.apidevelopment.entity;

import java.util.UUID;
import java.util.List;
import java.util.Objects;
import java.util.Collections;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private UserEntity user;

    @JoinTable(name = "CART_ITEM", joinColumns = @JoinColumn(name = "CART_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemEntity> items = Collections.emptyList();

    public UUID getId() {
        return id;
    }

    public CartEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public CartEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public CartEntity setItems(List<ItemEntity> items) {
        this.items = items;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CartEntity that = (CartEntity) o;
        return user.equals(that.user) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, items);
    }

}
