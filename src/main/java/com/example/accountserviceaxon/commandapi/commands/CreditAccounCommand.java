package com.example.accountserviceaxon.commandapi.commands;

public class CreditAccounCommand extends BaseCommand<String> {
    private String currency;
    private double amount;

    public CreditAccounCommand(String id, String currency, double amount) {
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

