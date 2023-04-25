package com.rozz.api.apidevelopment.entity.Accounts;

import com.rozz.api.apidevelopment.entity.Carts.ShoppingCart;
import com.rozz.api.apidevelopment.entity.Orders.Order;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "customer")
public abstract class Customer {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY, orphanRemoval = true)
    private ShoppingCart cart;

    @OneToOne
    @JoinColumn(name = "CUSTOMER_ORDER", referencedColumnName = "ID")
    private Order order;
}
