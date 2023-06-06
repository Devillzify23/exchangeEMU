package com.cryptocurrencies.api.infrastructure.out.db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_history")
public class TransactionHistoryEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "idUser")
    private Long idUser;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "actual_price")
    private BigDecimal actualPrice;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "op_type")
    private Character opType;
    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;
}
