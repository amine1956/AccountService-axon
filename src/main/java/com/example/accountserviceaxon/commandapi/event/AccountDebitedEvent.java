package com.example.accountserviceaxon.commandapi.event;

public class AccountDebitedEvent  extends BaseEvent<String> {
    private String currency;
    private double amount;

    public AccountDebitedEvent(String id, String currency, double amount) {
        super(id);
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}

