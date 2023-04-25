package com.rozz.api.apidevelopment.entity;

import java.util.UUID;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.FetchType;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @NotNull(message = "Customer name is required")
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "USER_STATUS")
    private String userStatus;

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY, orphanRemoval = true)
    private CartEntity cart;

    public UUID getId() {
        return id;
    }

    public CustomerEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CustomerEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CustomerEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomerEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public CustomerEntity setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public CartEntity getCart() {
        return cart;
    }

    public CustomerEntity setCart(CartEntity cart) {
        this.cart = cart;
        return this;
    }

}
