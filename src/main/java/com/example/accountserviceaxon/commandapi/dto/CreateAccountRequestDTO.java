package com.example.accountserviceaxon.commandapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateAccountRequestDTO {
    private String currency;
    private double intialebalance;
}
