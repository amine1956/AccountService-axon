package com.example.accountserviceaxon.query.reposetories;

import com.example.accountserviceaxon.query.entities.Account;
import com.example.accountserviceaxon.query.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTransactionReposetory extends JpaRepository<Transaction, Long> {
}

