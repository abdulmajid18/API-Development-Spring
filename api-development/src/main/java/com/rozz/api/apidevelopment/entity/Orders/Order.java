package com.rozz.api.apidevelopment.entity.Orders;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "ORDER_NUMBER")
    private String orderNumber;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @Column(name = "STATUS")
    private OrderStatus status;

    @OneToMany(mappedBy = "id")
    private List<OrderLog> orderLog;
}
