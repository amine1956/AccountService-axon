package com.example.accountserviceaxon.commande.controllers.aggregate;

import com.example.accountserviceaxon.commandapi.commands.CreateAccountCommand;
import com.example.accountserviceaxon.commandapi.commands.CreditAccounCommand;
import com.example.accountserviceaxon.commandapi.commands.DebitAcountCommand;
import com.example.accountserviceaxon.commandapi.enums.AccountStatus;
import com.example.accountserviceaxon.commandapi.event.AccountCreatedEvent;
import com.example.accountserviceaxon.commandapi.event.AccountDebitedEvent;
import com.example.accountserviceaxon.commandapi.event.AccoutCreditedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AccountAgregate {
    @AggregateIdentifier
    private String id;
    private double balance;
    private String currency;

    private AccountStatus status;

    public AccountAgregate() {
        // recommended by Axon
    }

    @CommandHandler
    public AccountAgregate(CreateAccountCommand command) {
        if (command.getIntialebalance() < 0)
            throw new IllegalArgumentException("Initial balance must be positive");
        AggregateLifecycle.apply(new AccountCreatedEvent(command.getId(), command.getIntialebalance(), command.getCurrency(), AccountStatus.CREATED));

    }

    @EventSourcingHandler
    public void on(AccountCreatedEvent event) {
        this.id = event.getId();
        this.balance = event.getIntialebalance();
        this.currency = event.getCurrency();
        this.status = event.getStatus();
    }

    @CommandHandler
    public void handle(CreditAccounCommand command) {
        if (command.getAmount() < 0)
            throw new IllegalArgumentException("Amount must be positive");
        AggregateLifecycle.apply(new AccoutCreditedEvent(command.getId(), command.getCurrency(), command.getAmount()));
    }

    @EventSourcingHandler
    public void on(AccoutCreditedEvent event) {

        this.balance += event.getAmount();


    }

    @CommandHandler
     public void handle(DebitAcountCommand command) {
         if (command.getAmount() < 0)
             throw new IllegalArgumentException("Amount must be positive");
         if(command.getAmount() > balance)
             throw new IllegalArgumentException("Amount must be less than balance");

         AggregateLifecycle.apply(new AccountDebitedEvent(command.getId(), command.getCurrency(), command.getAmount()));
     }
     @EventSourcingHandler
        public void on(AccountDebitedEvent event) {
            this.balance -= event.getAmount();
        }
}




