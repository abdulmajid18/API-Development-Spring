package com.rozz.api.apidevelopment.entity.Accounts;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Member extends Customer {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
    private Account account;
}

//
//public class Member extends Customer {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "ID", updatable = false, nullable = false)
//    private UUID id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
//    private Account account;
//}
