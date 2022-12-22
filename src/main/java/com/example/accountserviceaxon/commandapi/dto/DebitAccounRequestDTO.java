package com.example.accountserviceaxon.commandapi.dto;

public class DebitAccounRequestDTO {
    private String accountId;
    private String currency;
    private double amount;

    public DebitAccounRequestDTO(String currency, double amount) {
        accountId = accountId;

        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getAccountId() {
        return accountId;
    }
}

