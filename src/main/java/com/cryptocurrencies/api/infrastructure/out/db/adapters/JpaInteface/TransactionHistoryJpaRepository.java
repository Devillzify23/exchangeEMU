package com.cryptocurrencies.api.infrastructure.out.db.adapters.JpaInteface;

import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryJpaRepository extends JpaRepository<TransactionHistoryEntity,Long>
{
}
