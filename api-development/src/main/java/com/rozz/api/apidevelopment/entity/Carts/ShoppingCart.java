package com.rozz.api.apidevelopment.entity.Carts;


import com.rozz.api.apidevelopment.entity.Accounts.Account;
import com.rozz.api.apidevelopment.entity.Accounts.Customer;
import com.rozz.api.apidevelopment.entity.Items.Item;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "cart")
public class ShoppingCart {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @OneToOne(mappedBy = "cart", fetch = FetchType.LAZY, orphanRemoval = true)
    private Customer customer;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CART_ITEM", joinColumns = @JoinColumn(name = "CART_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<Item> items = Collections.emptyList();




    public UUID getId() {
        return id;
    }

    public ShoppingCart setId(UUID id) {
        this.id = id;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public ShoppingCart setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart cart = (ShoppingCart) o;
        return Objects.equals(id, cart.id) && Objects.equals(customer, cart.customer) && Objects.equals(items, cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, items);
    }
}



//package com.rozz.api.apidevelopment.entity.Carts;
//
//
//        import com.rozz.api.apidevelopment.entity.Accounts.Account;
//        import com.rozz.api.apidevelopment.entity.Items.Item;
//        import jakarta.persistence.*;
//
//        import java.util.Collections;
//        import java.util.List;
//        import java.util.Objects;
//        import java.util.UUID;

//@Entity
//@Table(name = "cart")
//public class ShoppingCart {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "ID", updatable = false, nullable = false)
//    private UUID id;
//
//    @OneToOne(mappedBy = "id", fetch = FetchType.LAZY, orphanRemoval = true)
//    private Account account;
//
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "CART_ITEM", joinColumns = @JoinColumn(name = "CART_ID"), inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
//    private List<Item> items = Collections.emptyList();
//
//
//    public UUID getId() {
//        return id;
//    }
//
//    public ShoppingCart setId(UUID id) {
//        this.id = id;
//        return this;
//    }
//
//    public Account getCustomer() {
//        return account;
//    }
//
//    public ShoppingCart setCustomer(Account account) {
//        this.account = account;
//        return this;
//    }
//
//    public List<Item> getItems() {
//        return items;
//    }
//
//    public ShoppingCart setItems(List<Item> items) {
//        this.items = items;
//        return this;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ShoppingCart cart = (ShoppingCart) o;
//        return Objects.equals(id, cart.id) && Objects.equals(account, cart.account) && Objects.equals(items, cart.items);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, account, items);
//    }
//}
