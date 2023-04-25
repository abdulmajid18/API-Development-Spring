package com.rozz.api.apidevelopment.entity.Accounts;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "STREET")
    private String streetAddress;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIPCODE")
    private String zipCode;

    @Column(name = "COUNTRY")
    private String country;


}
