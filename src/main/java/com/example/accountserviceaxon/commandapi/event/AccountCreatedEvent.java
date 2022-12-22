package com.example.accountserviceaxon.commandapi.event;

import com.example.accountserviceaxon.commandapi.enums.AccountStatus;

public class AccountCreatedEvent extends BaseEvent<String> {

    private double intialebalance;
    private String currency;

    private AccountStatus status;
    public AccountCreatedEvent(String id, double intialebalance, String currency,AccountStatus status) {
        super(id);
        this.intialebalance = intialebalance;
        this.currency = currency;
        this.status = status;
    }

    public double getIntialebalance() {
        return intialebalance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }
}

