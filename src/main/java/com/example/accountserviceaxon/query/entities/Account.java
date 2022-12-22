package com.example.accountserviceaxon.query.entities;

import com.example.accountserviceaxon.commandapi.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.spring.stereotype.Aggregate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.Date;
import java.util.List;
@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Account {
    @Id
   private String id;
   private Instant creationDate;
    private double balance;
    private AccountStatus status;
    private String currency;
    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

}

