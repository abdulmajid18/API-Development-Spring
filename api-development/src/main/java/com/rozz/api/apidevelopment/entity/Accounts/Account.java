package com.rozz.api.apidevelopment.entity.Accounts;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;
    @NotNull(message = "User name is required")
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;


    @OneToOne
    @JoinColumn(name = "ACCOUNT_ADDRESS", referencedColumnName = "ID")
    private Address address;


    @Column(name = "STATUS")
    private AccountStatus status;

    public String getUserName() {
        return userName;
    }

    public Account setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;

    }

    public Account setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Account setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Account setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getAddress() {
        return address;

    }

    public Account setAddress(Address address) {
        this.address = address;
        return this;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Account setStatus(AccountStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(userName, account.userName) && Objects.equals(password, account.password) && Objects.equals(email, account.email) && Objects.equals(phone, account.phone) && Objects.equals(firstName, account.firstName) && Objects.equals(lastName, account.lastName) && Objects.equals(address, account.address) && status == account.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, email, phone, firstName, lastName, address, status);
    }
}
