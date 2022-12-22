package com.example.accountserviceaxon.query;

import com.example.accountserviceaxon.query.entities.Account;
import com.example.accountserviceaxon.query.queries.GetAllAccount;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/query")
public class AccontQueryController {
    private QueryGateway queryGateway;

    public AccontQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }
    @GetMapping("/accounts")
    public CompletableFuture<List<Account>>getAllAccounts(){
        return  queryGateway.query(new GetAllAccount(), ResponseTypes.multipleInstancesOf(Account.class));
    }

}
