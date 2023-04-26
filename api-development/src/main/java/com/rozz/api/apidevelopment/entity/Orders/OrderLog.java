package com.rozz.api.apidevelopment.entity.Orders;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "orderLog")
public class OrderLog {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "STATUS")
    private OrderStatus status;

}
