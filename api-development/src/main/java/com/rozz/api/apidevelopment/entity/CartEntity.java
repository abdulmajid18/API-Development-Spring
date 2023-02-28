package com.rozz.api.apidevelopment.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class CartEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private UserEntity user;

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

}
