package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import com.cryptocurrencies.api.domain.port.service.TransactionHistoryServicePort;
import com.cryptocurrencies.api.domain.repository.transactionhistoryprovider.TransactionHistoryRepositoryPort;

import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionHistoryServiceAdapter implements TransactionHistoryServicePort
{
    TransactionHistoryRepositoryPort transactionHistoryRepositoryPort;
    @Override
    public List<TransactionHistory> getTransactionsById(Long id)
    {
        return transactionHistoryRepositoryPort.getTransactionsById(id);
    }

    @Override
    public TransactionHistory saveNewTransaction(TransactionHistory transactionHistory) {//hacer toda la logica aqui
        transactionHistory.setTransactionTime(LocalDateTime.now());
        return transactionHistoryRepositoryPort.saveNewTransaction(transactionHistory);
    }
}
