package com.rozz.api.apidevelopment.dto;

public class CustomerResponse {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String userStatus;

    public String getUsername() {
        return username;
    }

    public CustomerResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerResponse setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerResponse setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomerResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public CustomerResponse setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

}
