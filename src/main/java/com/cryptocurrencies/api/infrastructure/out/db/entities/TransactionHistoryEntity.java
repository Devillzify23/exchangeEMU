package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_history")
public class TransactionHistoryEntity
{
    @Id
    @Column(name = "idUser")
    private Long idUser;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "actual_price")
    private Double actualPrice;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "op_type")
    private Character opType;
    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;
}
