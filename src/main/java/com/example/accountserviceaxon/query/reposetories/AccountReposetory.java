package com.example.accountserviceaxon.query.reposetories;

import com.example.accountserviceaxon.query.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountReposetory extends JpaRepository<Account, String> {
}

