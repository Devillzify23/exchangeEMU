package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction_history {
    private int idUser;
    private String symbol;
    private double actualPrice;
    private double amount;
    private char opType;
}
