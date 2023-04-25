package com.rozz.api.apidevelopment.entity.Accounts;

import com.rozz.api.apidevelopment.entity.Accounts.Customer;

public class Guest extends Customer {
    public boolean registerAccount() {
        return false;
    }
}
