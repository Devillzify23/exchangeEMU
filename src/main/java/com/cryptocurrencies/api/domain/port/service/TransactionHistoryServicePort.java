package com.cryptocurrencies.api.domain.port.service;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import java.util.List;

public interface TransactionHistoryServicePort
{
    List<TransactionHistory> getTransactionsById(Long id);

    TransactionHistory saveNewTransaction(TransactionHistory transactionHistory);
}
