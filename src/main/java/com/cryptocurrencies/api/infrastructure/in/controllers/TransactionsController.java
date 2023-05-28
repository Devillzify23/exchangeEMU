package com.cryptocurrencies.api.infrastructure.in.controllers;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import com.cryptocurrencies.api.domain.port.service.PricingServicePort;
import com.cryptocurrencies.api.domain.port.service.TransactionHistoryServicePort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.TransactionHistoryDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.TransactionHistoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/transactions")
public class TransactionsController
{
    @Autowired
    protected TransactionHistoryServicePort service;
    private TransactionHistoryMapper transactionHistoryMapper;

    @GetMapping("/{id}")
    public List<TransactionHistoryDto> getTransaction(@PathVariable("id") Long id)
    {
        List<TransactionHistory> transactions = service.getTransactionsById(id);
       return transactions.stream().map(x -> transactionHistoryMapper.toDto(x)).toList();
    }
}
