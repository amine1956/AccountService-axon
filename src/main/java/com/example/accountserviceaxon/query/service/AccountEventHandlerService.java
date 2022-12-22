package com.example.accountserviceaxon.query.service;

import com.example.accountserviceaxon.commandapi.event.AccountCreatedEvent;
import com.example.accountserviceaxon.query.entities.Account;
import com.example.accountserviceaxon.query.queries.GetAllAccount;
import com.example.accountserviceaxon.query.reposetories.AccountReposetory;
import com.example.accountserviceaxon.query.reposetories.AccountTransactionReposetory;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.EventMessage;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.management.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j

public class AccountEventHandlerService {
    private  AccountReposetory accountReposetory;
    private AccountTransactionReposetory accountTransactionReposetory;

    public AccountEventHandlerService(AccountReposetory accountReposetory, AccountTransactionReposetory accountTransactionReposetory) {
        this.accountReposetory = accountReposetory;
        this.accountTransactionReposetory = accountTransactionReposetory;
    }
    @EventHandler
    public void on(AccountCreatedEvent event,EventMessage<AccountCreatedEvent> EventMessage){
        log.info("AccountCreatedEvent: {}",event);
        Account account = new Account();
        account.setId(event.getId());
        account.setBalance(event.getIntialebalance());
        account.setStatus(event.getStatus());
        account.setCurrency(event.getCurrency());
        account.setCreationDate(EventMessage.getTimestamp());
        accountReposetory.save(account);
    }
    @QueryHandler
    public List<Account> on(GetAllAccount query){
        return accountReposetory.findAll();
    }
}
