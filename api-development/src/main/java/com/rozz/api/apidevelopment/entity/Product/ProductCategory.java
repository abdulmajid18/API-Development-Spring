package com.rozz.api.apidevelopment.entity.Product;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "category")
public class ProductCategory {
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToOne(mappedBy = "category")
    private Product product;
}
