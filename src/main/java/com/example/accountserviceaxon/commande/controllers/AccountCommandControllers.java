package com.example.accountserviceaxon.commande.controllers;

import com.example.accountserviceaxon.commandapi.commands.CreditAccounCommand;
import com.example.accountserviceaxon.commandapi.commands.DebitAcountCommand;
import com.example.accountserviceaxon.commandapi.dto.CreateAccountRequestDTO;
import com.example.accountserviceaxon.commandapi.commands.CreateAccountCommand;
import com.example.accountserviceaxon.commandapi.dto.CreditAccountDTO;
import com.example.accountserviceaxon.commandapi.dto.DebitAccounRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@RequestMapping("/commands/account")
public class AccountCommandControllers {
    private EventStore eventStore;
    private CommandGateway commandGateway;
    public AccountCommandControllers(EventStore eventStore, CommandGateway commandGateway) {
        this.eventStore = eventStore;
        this.commandGateway = commandGateway;
    }

    @PostMapping("/create")
    public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequestDTO createAccountRequestDTO) {
        return commandGateway.send(new
                CreateAccountCommand(UUID.randomUUID().toString(),
                createAccountRequestDTO.getIntialebalance(),
                createAccountRequestDTO.getCurrency()));

    }
    @GetMapping("/eventsStore/{id}")
    public Stream getEventsStore(@PathVariable String id){
        return eventStore.readEvents(id).asStream();
    }

    @PostMapping("/credit/")
        public CompletableFuture<String> creditAccount(@RequestBody CreditAccountDTO creditAccountDTO) {
        return commandGateway.send(new
                CreditAccounCommand(creditAccountDTO.getAccountId(),
                creditAccountDTO.getCurrency(),
                creditAccountDTO.getAmount()));

    }
    @PostMapping("/debit/")
    public CompletableFuture<String> debitAccount(@RequestBody DebitAccounRequestDTO debitAccounRequestDTO) {
        return commandGateway.send(new
                DebitAcountCommand(debitAccounRequestDTO.getAccountId(),
                debitAccounRequestDTO.getCurrency(),debitAccounRequestDTO.getAmount()));


    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
