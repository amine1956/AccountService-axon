package com.example.accountserviceaxon.commandapi.commands;

import lombok.Getter;

public class DebitAcountCommand  extends BaseCommand<String> {
    @Getter private String currency;
    @Getter  private double amount;


    public DebitAcountCommand(String id, String currency, double amount) {
        super(id);
        this.currency = currency;
        this.amount = amount;
    }



    public double getAmount() {
        return amount;
    }
}


