package com.example.accountserviceaxon.commandapi.commands;

import lombok.Getter;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseCommand <T> {

    @TargetAggregateIdentifier
    @Getter public  T id;

    public BaseCommand(T id) {
        this.id = id;
    }
}

