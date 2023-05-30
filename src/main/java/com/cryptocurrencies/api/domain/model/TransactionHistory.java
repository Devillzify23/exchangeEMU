package com.cryptocurrencies.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistory
{
    private Long id;
    private Long idUser;
    private String symbol;
    private double actualPrice;
    private double amount;
    private char opType;
    private LocalDateTime transactionTime;
}
