package com.example.accountserviceaxon.commandapi.commands;

import lombok.Getter;

public class CreateAccountCommand extends BaseCommand<String> {

    @Getter private double intialebalance;
    @Getter  private String currency;

    public CreateAccountCommand(String id, double intialebalance, String currency) {
        super(id);
        this.intialebalance = intialebalance;
        this.currency = currency;
    }
}

