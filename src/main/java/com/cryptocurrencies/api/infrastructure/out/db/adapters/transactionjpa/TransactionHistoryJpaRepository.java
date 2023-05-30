package com.cryptocurrencies.api.infrastructure.out.db.adapters.transactionjpa;

import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionHistoryJpaRepository extends JpaRepository<TransactionHistoryEntity,Long>
{
    List<TransactionHistoryEntity> findTransactionHistoryEntitiesByIdUser(Long id);
}
