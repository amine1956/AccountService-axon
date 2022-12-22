package com.example.accountserviceaxon.commandapi.event;

public class AccoutCreditedEvent extends BaseEvent<String> {
    private String currency;
    private double amount;

    public AccoutCreditedEvent(String id, String currency, double amount) {
        super(id);
        this.currency = currency;
        this.amount = amount;
    }

    public AccoutCreditedEvent(String id) {
        super(id);
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}

