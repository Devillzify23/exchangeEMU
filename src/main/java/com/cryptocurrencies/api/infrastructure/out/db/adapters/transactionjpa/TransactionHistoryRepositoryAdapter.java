package com.cryptocurrencies.api.infrastructure.out.db.adapters.transactionjpa;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import com.cryptocurrencies.api.domain.repository.transactionhistoryprovider.TransactionHistoryRepositoryPort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.TransactionHistoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@AllArgsConstructor
@Repository
public class TransactionHistoryRepositoryAdapter implements TransactionHistoryRepositoryPort
{
    private TransactionHistoryJpaRepository transactionHistoryJpaRepository;
    private TransactionHistoryMapper transactionHistoryMapper;

    @Override
    public List<TransactionHistory> getTransactionsById(Long id)
    {
        return transactionHistoryJpaRepository.findTransactionHistoryEntitiesByIdUser(id).stream().map(x -> transactionHistoryMapper.toModel(x)).toList();
    }

    @Override
    public TransactionHistory saveNewTransaction(TransactionHistory transactionHistory) {
        TransactionHistoryEntity entity = transactionHistoryJpaRepository.save(transactionHistoryMapper.toEntity(transactionHistory));
        return  transactionHistoryMapper.toModel(entity);
    }
}
