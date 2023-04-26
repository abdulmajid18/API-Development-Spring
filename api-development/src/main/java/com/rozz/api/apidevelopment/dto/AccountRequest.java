package com.rozz.api.apidevelopment.dto;

import com.rozz.api.apidevelopment.entity.Accounts.Account;
import com.rozz.api.apidevelopment.entity.Accounts.AccountStatus;
import com.rozz.api.apidevelopment.entity.Accounts.Address;
import com.rozz.api.apidevelopment.entity.Accounts.Member;
import com.rozz.api.apidevelopment.entity.Product.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

public class AccountRequest {
    private String userName;
    private String password;
    private String email;

    private String phone;

    private String firstName;

    private String lastName;

    private Address address;

    private Member member;

    private AccountStatus status;

    private Product product;

    public String getUserName() {
        return userName;
    }

    public AccountRequest(String userName, String password, String email, String phone, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address("Ridge my","Accra","AK","+233","GHANA");
        this.status = AccountStatus.ACTIVE;
    }

    public AccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;

    }

    public AccountRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public AccountRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AccountRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getAddress() {
        return address;

    }

    public AccountRequest setAddress(Address address) {
        this.address = address;
        return this;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public AccountRequest setStatus(AccountStatus status) {
        this.status = status;
        return this;
    }

}

