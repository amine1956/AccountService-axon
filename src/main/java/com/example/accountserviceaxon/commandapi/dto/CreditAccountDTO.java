package com.example.accountserviceaxon.commandapi.dto;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

public class CreditAccountDTO  {

   @Getter
   private String AccountId;
    private String currency;
    private double amount;

    public CreditAccountDTO(String accountId, String currency, double amount) {
        AccountId = accountId;
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
