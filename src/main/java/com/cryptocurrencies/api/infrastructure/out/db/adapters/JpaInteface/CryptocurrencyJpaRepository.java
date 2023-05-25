package com.cryptocurrencies.api.infrastructure.out.db.adapters.JpaInteface;

import com.cryptocurrencies.api.infrastructure.out.db.entities.CryptocurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptocurrencyJpaRepository extends JpaRepository<CryptocurrencyEntity, String> {
}
