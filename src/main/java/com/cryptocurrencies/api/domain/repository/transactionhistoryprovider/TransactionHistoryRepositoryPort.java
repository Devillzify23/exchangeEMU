package com.cryptocurrencies.api.domain.repository.transactionhistoryprovider;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import java.util.List;

public interface TransactionHistoryRepositoryPort
{
    List<TransactionHistory> getTransactionsById(Long id);

    TransactionHistory saveNewTransaction(TransactionHistory transactionHistory);
}
