package com.rozz.api.apidevelopment.entity.Accounts;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "member")
public class Member extends Customer {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID", referencedColumnName = "ID")
    private Account account;
}
