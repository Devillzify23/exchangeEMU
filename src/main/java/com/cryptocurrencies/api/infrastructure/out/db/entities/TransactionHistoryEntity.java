package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_history")
public class TransactionHistoryEntity
{
    @Id
    private int idUser;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "actual_price")
    private double actualPrice;

    @Column(name = "amount")
    private double amount;

    @Column(name = "op_type")
    private char opType;
}
